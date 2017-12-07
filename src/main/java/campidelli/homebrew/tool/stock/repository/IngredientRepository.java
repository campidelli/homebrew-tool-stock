package campidelli.homebrew.tool.stock.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import campidelli.homebrew.tool.stock.domain.Ingredient;

/**
 * Defines the persistence services for ingredients.
 * @author campidelli
 */
public interface IngredientRepository extends MongoRepository<Ingredient, String> {

}
