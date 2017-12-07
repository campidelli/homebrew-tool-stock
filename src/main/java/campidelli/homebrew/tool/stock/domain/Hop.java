package campidelli.homebrew.tool.stock.domain;

import campidelli.homebrew.tool.commons.model.Color;
import campidelli.homebrew.tool.commons.model.IBU;

/**
 * Used to give bitterness and flavor to a beer.
 * @author campidelli
 */
public class Hop extends Ingredient {

  private IBU IBU;

  /**
   * Construct a new hop
   */
  public Hop() {
    super(null, null, new Color());
  }

  /**
   * Construct a new hop
   * @param id the id
   * @param name the name
   * @param IBU the IBU
   */
  public Hop(String id, String name, IBU IBU) {
    super(id, name, new Color());
    this.IBU = IBU;
  }

  /**
   * @return the iBU
   */
  public IBU getIBU() {
    return IBU;
  }

  /**
   * @param iBU the iBU to set
   */
  public void setIBU(IBU IBU) {
    this.IBU = IBU;
  }
}
