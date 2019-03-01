package tutorialapp.tacoapp.repo;

import org.springframework.data.repository.CrudRepository;
import tutorialapp.tacoapp.domain.Ingredient;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {
}
