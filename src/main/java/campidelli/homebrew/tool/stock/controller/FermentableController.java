package campidelli.homebrew.tool.stock.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import campidelli.homebrew.tool.commons.exception.ResourceNotFoundException;
import campidelli.homebrew.tool.stock.domain.Fermentable;
import campidelli.homebrew.tool.stock.service.StockService;

/**
 * API contaning operations to manage a stock of fermentable ingredients.
 * @author campidelli
 */
@RestController
@RequestMapping("/v1/fermentables")
public class FermentableController {

  @Autowired
  private StockService stockService;

  @PostMapping
  public ResponseEntity<Fermentable> addFermentable(@RequestBody(required = true) Fermentable fermentable)
      throws URISyntaxException {

    Fermentable createdFermentable = (Fermentable) stockService.insert(fermentable);
    URI uri = new URI("fermentables/" + createdFermentable.getId());
    return ResponseEntity.created(uri).body(createdFermentable);
  }

  @PutMapping(path = "/{fermentableId}")
  public ResponseEntity<Fermentable> updateFermentable(
      @PathVariable String fermentableId,
      @RequestBody(required = true) Fermentable fermentable) throws URISyntaxException {
    
    Fermentable existentFermentable = (Fermentable) stockService.findById(fermentableId);
    if (existentFermentable == null) {
      String msg = "Fermentable with id %s was not found.";
      throw new ResourceNotFoundException(String.format(msg, fermentableId));
    }

    existentFermentable = (Fermentable) stockService.update(fermentable);
    return ResponseEntity.ok().body(existentFermentable);
  }
}
