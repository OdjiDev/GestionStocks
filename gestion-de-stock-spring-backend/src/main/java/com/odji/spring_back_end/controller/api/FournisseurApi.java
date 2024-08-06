package com.odji.spring_back_end.controller.api;

import static com.odji.spring_back_end.utils.Constants.FOURNISSEUR_ENDPOINT;

import com.odji.spring_back_end.dto.FournisseurDto;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Interface for Fournisseur API.
 */
public interface FournisseurApi {

  /**
   * Create or update a supplier.
   *
   * @param dto The supplier to create or update.
   * @return The created or updated supplier.
   */
  @PostMapping(FOURNISSEUR_ENDPOINT + "/create")
  FournisseurDto save(@RequestBody FournisseurDto dto);

  /**
   * Find a supplier by its ID.
   *
   * @param idFournisseur The ID of the supplier.
   * @return The supplier with the specified ID.
   */
  @GetMapping(FOURNISSEUR_ENDPOINT + "/{idFournisseur}")
  FournisseurDto findById(@PathVariable("idFournisseur") Integer id);

  /**
   * Find all suppliers.
   *
   * @return A list of all suppliers.
   */
  @GetMapping(FOURNISSEUR_ENDPOINT + "/all")
  List<FournisseurDto> findAll();

  /**
   * Delete a supplier by its ID.
   *
   * @param idFournisseur The ID of the supplier to delete.
   */
  @DeleteMapping(FOURNISSEUR_ENDPOINT + "/delete/{idFournisseur}")
  void delete(@PathVariable("idFournisseur") Integer id);

}
