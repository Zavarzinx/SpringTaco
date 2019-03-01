package tutorialapp.tacoapp.repo;

import org.springframework.data.repository.CrudRepository;
import tutorialapp.tacoapp.domain.Taco;

public interface TacoRepository
        extends CrudRepository<Taco, Long> {
}
