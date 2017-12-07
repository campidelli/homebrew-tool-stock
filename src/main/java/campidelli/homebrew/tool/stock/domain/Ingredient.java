package campidelli.homebrew.tool.stock.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import campidelli.homebrew.tool.commons.model.Color;

/**
 * The most generic type of ingredient.
 * @author campidelli
 */
@Document(collection = "ingredients")
public abstract class Ingredient {

  @Id
  private String id;
  private String name;
  private Color color;

  /**
   * Construct a new Ingredient
   */
  protected Ingredient() {
  }

  /**
   * Construct a new Ingredient
   * @param id the id
   * @param name the name
   * @param color the color
   */
  protected Ingredient(String id, String name, Color color) {
    this.id = id;
    this.name = name;
    this.color = color;
  }

  /**
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the color
   */
  public Color getColor() {
    return color;
  }

  /**
   * @param color the color to set
   */
  public void setColor(Color color) {
    this.color = color;
  }
}
