package campidelli.homebrew.tool.stock.service;

import org.springframework.stereotype.Service;

/**
 * Provides validation services.
 * @author campidelli
 */
@Service
public class ValidationService {

  private static final String MSG_MUST_NOT_BE_NULL = "%s must not be null.";
  private static final String MSG_MUST_BE_NULL = "%s must be null.";

  public void validateMustBeNull(Object instance, String name) {
    if (instance != null) {
      String msg = String.format(MSG_MUST_BE_NULL, name);
      throw new IllegalArgumentException(msg);
    }
  }

  public void validateMustNotBeNull(Object instance, String name) {
    if (instance == null) {
      String msg = String.format(MSG_MUST_NOT_BE_NULL, name);
      throw new IllegalArgumentException(msg);
    }
  }
}
