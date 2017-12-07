package campidelli.homebrew.tool.stock.domain;

import campidelli.homebrew.tool.commons.model.Color;
import campidelli.homebrew.tool.commons.model.Gravity;

/**
 * A fermentable ingredient.
 * @author campidelli
 */
public class Fermentable extends Ingredient {

  public enum Type {
    ADJUNCT, GRAIN, DRY_EXTRACT, LIQUID_EXTRACT, SUGAR, FRUIT
  }

  private Type type;
  private Gravity gravity;

  /**
   * Construct a new fermentable ingredient
   */
  public Fermentable() {
  }

  /**
   * Construct a new fermentable ingredient
   * @param id the id
   * @param name the name
   * @param color the color
   * @param type the type
   * @param gravity the gravity
   */
  public Fermentable(String id, String name, Color color, Type type, Gravity gravity) {
    super(id, name, color);
    this.type = type;
    this.gravity = gravity;
  }

  /**
   * @return the type
   */
  public Type getType() {
    return type;
  }

  /**
   * @param type the type to set
   */
  public void setType(Type type) {
    this.type = type;
  }

  /**
   * @return the gravity
   */
  public Gravity getGravity() {
    return gravity;
  }

  /**
   * @param gravity the gravity to set
   */
  public void setGravity(Gravity gravity) {
    this.gravity = gravity;
  }
}
