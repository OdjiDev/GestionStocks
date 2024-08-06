package com.odji.spring_back_end.controller.api;

import static com.odji.spring_back_end.utils.Constants.APP_ROOT;

import com.odji.spring_back_end.dto.ClientDto;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Interface for Client API.
 */
public interface ClientApi {

  /**
   * Save a client.
   *
   * @param dto The client to save.
   * @return The saved or updated client.
   */
  @PostMapping(value = APP_ROOT + "/clients/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  ClientDto save(@RequestBody ClientDto dto);

  /**
   * Find a client by ID.
   *
   * @param idClient The ID of the client.
   * @return The client with the specified ID.
   */
  @GetMapping(value = APP_ROOT + "/clients/{idClient}", produces = MediaType.APPLICATION_JSON_VALUE)
  ClientDto findById(@PathVariable("idClient") Integer idClient);

  /**
   * Find all clients.
   *
   * @return A list of all clients.
   */
  @GetMapping(value = APP_ROOT + "/clients/all", produces = MediaType.APPLICATION_JSON_VALUE)
  List<ClientDto> findAll();

  /**
   * Delete a client by ID.
   *
   * @param idClient The ID of the client to delete.
   */
  @DeleteMapping(value = APP_ROOT + "/clients/delete/{idClient}")
  void delete(@PathVariable("idClient") Integer idClient);
}
