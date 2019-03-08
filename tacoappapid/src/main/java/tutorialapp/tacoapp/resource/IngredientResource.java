package tutorialapp.tacoapp.resource;

import lombok.Getter;
import org.springframework.hateoas.ResourceSupport;
import tutorialapp.tacoapp.domain.Ingredient;

public class IngredientResource extends ResourceSupport {
    @Getter
    private String name;
    @Getter
    private Ingredient.Type type;
    public IngredientResource(Ingredient ingredient) {
        this.name = ingredient.getName();
        this.type = ingredient.getType();
    }
}