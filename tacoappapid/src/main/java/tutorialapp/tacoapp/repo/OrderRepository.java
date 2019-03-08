package tutorialapp.tacoapp.repo;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import tutorialapp.tacoapp.domain.Order;
import tutorialapp.tacoapp.domain.User;

import java.util.List;

public interface OrderRepository
        extends CrudRepository<Order, Long> {
    List<Order> findByUserOrderByPlacedAtDesc(
            User user, Pageable pageable);
}