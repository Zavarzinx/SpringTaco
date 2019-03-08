package tutorialapp.tacoapp.repo;

import org.springframework.data.repository.CrudRepository;
import tutorialapp.tacoapp.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}