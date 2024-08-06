package com.odji.spring_back_end.controller.api;

import static com.odji.spring_back_end.utils.Constants.UTILISATEUR_ENDPOINT;

import com.odji.spring_back_end.dto.ChangerMotDePasseUtilisateurDto;
import com.odji.spring_back_end.dto.UtilisateurDto;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Interface for User API.
 */
public interface UtilisateurApi {

  /**
   * Create a new user.
   *
   * @param dto The user data transfer object containing user details.
   * @return The created user DTO.
   */
  @PostMapping(UTILISATEUR_ENDPOINT + "/create")
  UtilisateurDto save(@RequestBody UtilisateurDto dto);

  /**
   * Change the password for a user.
   *
   * @param dto The DTO containing user ID and new password.
   * @return The updated user DTO.
   */
  @PostMapping(UTILISATEUR_ENDPOINT + "/update/password")
  UtilisateurDto changerMotDePasse(@RequestBody ChangerMotDePasseUtilisateurDto dto);

  /**
   * Find a user by ID.
   *
   * @param id The user ID.
   * @return The user DTO.
   */
  @GetMapping(UTILISATEUR_ENDPOINT + "/{idUtilisateur}")
  UtilisateurDto findById(@PathVariable("idUtilisateur") Integer id);

  /**
   * Find a user by email.
   *
   * @param email The user email.
   * @return The user DTO.
   */
  @GetMapping(UTILISATEUR_ENDPOINT + "/find/{email}")
  UtilisateurDto findByEmail(@PathVariable("email") String email);

  /**
   * Find all users.
   *
   * @return A list of user DTOs.
   */
  @GetMapping(UTILISATEUR_ENDPOINT + "/all")
  List<UtilisateurDto> findAll();

  /**
   * Delete a user by ID.
   *
   * @param id The user ID.
   */
  @DeleteMapping(UTILISATEUR_ENDPOINT + "/delete/{idUtilisateur}")
  void delete(@PathVariable("idUtilisateur") Integer id);

}
