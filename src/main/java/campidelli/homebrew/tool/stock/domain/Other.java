package campidelli.homebrew.tool.stock.domain;

import campidelli.homebrew.tool.commons.model.Color;

/**
 * An unspecified ingredient.
 * @author campidelli
 */
public class Other extends Ingredient {

  public enum Type {
    YEAST, SPICE, FINING, FLAVOR, HERB, WATER_AGENT, OTHER
  }

  private Type type;

  /**
   * Construct a new type of other ingredient
   */
  public Other() {
  }

  /**
   * Construct a new type of other ingredient
   * @param id the id
   * @param name the name
   * @param IBU the IBU
   */
  public Other(String id, String name, Color color, Type type) {
    super(id, name, color);
    this.type = type;
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
}
