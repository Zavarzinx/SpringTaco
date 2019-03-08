package tutorialapp.tacoapp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import tutorialapp.tacoapp.domain.Ingredient;

@CrossOrigin(origins="*")
public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {
}
