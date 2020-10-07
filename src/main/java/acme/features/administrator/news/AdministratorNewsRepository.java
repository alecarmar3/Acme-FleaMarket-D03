
package acme.features.administrator.news;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.News;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AdministratorNewsRepository extends AbstractRepository {

	@Query("select n from News n where n.id = ?1")
	News findOneById(int id);

	@Query("select n from News n")
	Collection<News> findNews();

}
