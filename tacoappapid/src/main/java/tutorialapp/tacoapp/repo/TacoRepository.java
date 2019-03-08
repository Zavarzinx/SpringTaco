package tutorialapp.tacoapp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tutorialapp.tacoapp.domain.Taco;

public interface TacoRepository
        extends PagingAndSortingRepository<Taco, Long> {

}