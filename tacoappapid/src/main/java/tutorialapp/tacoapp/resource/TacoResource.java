package tutorialapp.tacoapp.resource;
import java.util.Date;
import java.util.List;
import org.springframework.hateoas.ResourceSupport;

import lombok.Getter;
import org.springframework.hateoas.core.Relation;
import tutorialapp.tacoapp.domain.Ingredient;
import tutorialapp.tacoapp.domain.Taco;

@Relation(value="taco", collectionRelation="tacos")
public class TacoResource extends ResourceSupport {

    private static final IngredientResourceAssembler
            ingredientAssembler = new IngredientResourceAssembler();

        @Getter
        private final String name;
        @Getter
        private final Date createdAt;
        @Getter
        private final List<IngredientResource> ingredients;
        public TacoResource(Taco taco) {
            this.name = taco.getName();
            this.createdAt = taco.getCreatedAt();
            this.ingredients =
                    ingredientAssembler.toResources(taco.getIngredients());
        }
    }
