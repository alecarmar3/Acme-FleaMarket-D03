
package acme.features.administrator.toolSheet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.ToolSheet;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractDeleteService;

@Service
public class AdministratorToolSheetDeleteService implements AbstractDeleteService<Administrator, ToolSheet> {

	@Autowired
	AdministratorToolSheetRepository repository;


	@Override
	public boolean authorise(final Request<ToolSheet> request) {
		assert request != null;
		return true;
	}

	@Override
	public void bind(final Request<ToolSheet> request, final ToolSheet entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}
	@Override
	public void unbind(final Request<ToolSheet> request, final ToolSheet entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "description", "providerName", "homePage", "stars");
	}
	@Override
	public ToolSheet findOne(final Request<ToolSheet> request) {
		assert request != null;
		ToolSheet result;
		int id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);
		return result;

	}
	@Override
	public void validate(final Request<ToolSheet> request, final ToolSheet entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}
	@Override
	public void delete(final Request<ToolSheet> request, final ToolSheet entity) {
		assert request != null;
		assert entity != null;

		this.repository.delete(entity);
	}
}
