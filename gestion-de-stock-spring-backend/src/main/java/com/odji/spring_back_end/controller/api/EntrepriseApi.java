package com.odji.spring_back_end.controller.api;

import static com.odji.spring_back_end.utils.Constants.ENTREPRISE_ENDPOINT;

import com.odji.spring_back_end.dto.EntrepriseDto;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Interface for Entreprise API.
 */
public interface EntrepriseApi {

  /**
   * Create or update an enterprise.
   *
   * @param dto The enterprise to create or update.
   * @return The created or updated enterprise.
   */
  @PostMapping(ENTREPRISE_ENDPOINT + "/create")
  EntrepriseDto save(@RequestBody EntrepriseDto dto);

  /**
   * Find an enterprise by its ID.
   *
   * @param id The ID of the enterprise.
   * @return The enterprise with the specified ID.
   */
  @GetMapping(ENTREPRISE_ENDPOINT + "/{idEntreprise}")
  EntrepriseDto findById(@PathVariable("idEntreprise") Integer id);

  /**
   * Find all enterprises.
   *
   * @return A list of all enterprises.
   */
  @GetMapping(ENTREPRISE_ENDPOINT + "/all")
  List<EntrepriseDto> findAll();

  /**
   * Delete an enterprise by its ID.
   *
   * @paramidEntreprise The ID of the enterprise to delete.
   */
  @DeleteMapping(ENTREPRISE_ENDPOINT + "/delete/{idEntreprise}")
  void delete(@PathVariable("idEntreprise") Integer id);
}
