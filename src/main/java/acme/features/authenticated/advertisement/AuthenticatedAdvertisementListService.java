
package acme.features.authenticated.advertisement;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.Advertisement;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractListService;

@Service
public class AuthenticatedAdvertisementListService implements AbstractListService<Authenticated, Advertisement> {

	@Autowired
	AuthenticatedAdvertisementRepository repository;


	@Override
	public boolean authorise(final Request<Advertisement> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<Advertisement> request, final Advertisement entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "displayedUntil");
	}

	@Override
	public Collection<Advertisement> findMany(final Request<Advertisement> request) {
		assert request != null;
		Collection<Advertisement> result;

		result = this.repository.findActiveAdvertisement();

		return result;
	}

}
