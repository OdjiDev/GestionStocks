package com.odji.spring_back_end.controller.api;

import static com.odji.spring_back_end.utils.Constants.VENTES_ENDPOINT;

import com.odji.spring_back_end.dto.VentesDto;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Interface for Sales API.
 */
public interface VentesApi {

  /**
   * Create a new sale.
   *
   * @param dto The sales data transfer object containing sale details.
   * @return The created sales DTO.
   */
  @PostMapping(VENTES_ENDPOINT + "/create")
  VentesDto save(@RequestBody VentesDto dto);

  /**
   * Find a sale by its ID.
   *
   * @param id The sale ID.
   * @return The sales DTO.
   */
  @GetMapping(VENTES_ENDPOINT + "/{idVente}")
  VentesDto findById(@PathVariable("idVente") Integer id);

  /**
   * Find a sale by its code.
   *
   * @param code The sale code.
   * @return The sales DTO.
   */
  @GetMapping(VENTES_ENDPOINT + "/{codeVente}")
  VentesDto findByCode(@PathVariable("codeVente") String code);

  /**
   * Get all sales.
   *
   * @return A list of sales DTOs.
   */
  @GetMapping(VENTES_ENDPOINT + "/all")
  List<VentesDto> findAll();

  /**
   * Delete a sale by its ID.
   *
   * @param id The sale ID.
   */
  @DeleteMapping(VENTES_ENDPOINT + "/delete/{idVente}")
  void delete(@PathVariable("idVente") Integer id);

}
