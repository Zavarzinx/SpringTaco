package tutorialapp.tacoapp.repo;

import org.springframework.data.repository.CrudRepository;
import tutorialapp.tacoapp.domain.Order;

public interface OrderRepository
        extends CrudRepository<Order, Long> {
}