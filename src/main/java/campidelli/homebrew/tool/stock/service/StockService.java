package campidelli.homebrew.tool.stock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import campidelli.homebrew.tool.stock.domain.Ingredient;
import campidelli.homebrew.tool.stock.repository.IngredientRepository;

/**
 * Provides services to manage the ingredient stock.
 * @author campidelli
 */
@Service
public class StockService {

  private static final String INGREDIENT = "ingredient";
  private static final String NAME = "name";
  private static final String ID = "id";

  @Autowired
  private ValidationService validation;

  @Autowired
  private IngredientRepository repository;

  /**
   * Insert an ingredient.
   * @param ingredient The ingredient to be saved, must have at least a NAME and must not have an ID.
   * @return The created ingredient.
   */
  public Ingredient insert(Ingredient ingredient) {
    validation.validateMustNotBeNull(ingredient, INGREDIENT);
    validation.validateMustNotBeNull(ingredient.getName(), NAME);
    validation.validateMustBeNull(ingredient.getId(), ID);

    return repository.insert(ingredient);
  }

  /**
   * Update an ingredient.
   * @param ingredient The ingredient to be saved, must have at least a NAME and ID.
   * @return The updated ingredient.
   */
  public Ingredient update(Ingredient ingredient) {
    validation.validateMustNotBeNull(ingredient, INGREDIENT);
    validation.validateMustNotBeNull(ingredient.getName(), NAME);
    validation.validateMustNotBeNull(ingredient.getId(), ID);

    return repository.save(ingredient);
  }

  /**
   * Deletes an ingredient.
   * @param ingredientId ID of the ingredient to be deleted.
   */
  public void delete(String ingredientId) {
    validation.validateMustNotBeNull(ingredientId, ID);

    repository.delete(ingredientId);
  }

  /**
   * Find an ingredient by its id.
   * @param ingredientId ID of the ingredient to be found.
   */
  public Ingredient findById(String ingredientId) {
    validation.validateMustNotBeNull(ingredientId, ID);

    return repository.findOne(ingredientId);
  }
}
