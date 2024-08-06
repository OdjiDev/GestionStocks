package com.odji.spring_back_end.controller.api;

import static com.odji.spring_back_end.utils.Constants.APP_ROOT;

import com.odji.spring_back_end.dto.CommandeClientDto;
import com.odji.spring_back_end.dto.LigneCommandeClientDto;
import com.odji.spring_back_end.model.EtatCommande;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Interface for CommandeClient API.
 */
public interface CommandeClientApi {

  /**
   * Create or update a client order.
   *
   * @param dto The order to create or update.
   * @return The created or updated order.
   */
  @PostMapping(APP_ROOT + "/commandesclients/create")
  ResponseEntity<CommandeClientDto> save(@RequestBody CommandeClientDto dto);

  /**
   * Update the status of an order.
   *
   * @param idCommande The ID of the order.
   * @param etatCommande The new status of the order.
   * @return The updated order.
   */
  @PatchMapping(APP_ROOT + "/commandesclients/update/etat/{idCommande}/{etatCommande}")
  ResponseEntity<CommandeClientDto> updateEtatCommande(@PathVariable("idCommande") Integer idCommande,
                                                       @PathVariable("etatCommande") EtatCommande etatCommande);

  /**
   * Update the quantity of an order line.
   *
   * @param idCommande The ID of the order.
   * @param idLigneCommande The ID of the order line.
   * @param quantite The new quantity.
   * @return The updated order.
   */
  @PatchMapping(APP_ROOT + "/commandesclients/update/quantite/{idCommande}/{idLigneCommande}/{quantite}")
  ResponseEntity<CommandeClientDto> updateQuantiteCommande(@PathVariable("idCommande") Integer idCommande,
                                                           @PathVariable("idLigneCommande") Integer idLigneCommande,
                                                           @PathVariable("quantite") BigDecimal quantite);

  /**
   * Update the client associated with an order.
   *
   * @param idCommande The ID of the order.
   * @param idClient The ID of the new client.
   * @return The updated order.
   */
  @PatchMapping(APP_ROOT + "/commandesclients/update/client/{idCommande}/{idClient}")
  ResponseEntity<CommandeClientDto> updateClient(@PathVariable("idCommande") Integer idCommande,
                                                 @PathVariable("idClient") Integer idClient);

  /**
   * Update the article associated with an order line.
   *
   * @param idCommande The ID of the order.
   * @param idLigneCommande The ID of the order line.
   * @param idArticle The ID of the new article.
   * @return The updated order.
   */
  @PatchMapping(APP_ROOT + "/commandesclients/update/article/{idCommande}/{idLigneCommande}/{idArticle}")
  ResponseEntity<CommandeClientDto> updateArticle(@PathVariable("idCommande") Integer idCommande,
                                                  @PathVariable("idLigneCommande") Integer idLigneCommande,
                                                  @PathVariable("idArticle") Integer idArticle);

  /**
   * Delete an article from an order.
   *
   * @param idCommande The ID of the order.
   * @param idLigneCommande The ID of the order line.
   * @return The updated order.
   */
  @DeleteMapping(APP_ROOT + "/commandesclients/delete/article/{idCommande}/{idLigneCommande}")
  ResponseEntity<CommandeClientDto> deleteArticle(@PathVariable("idCommande") Integer idCommande,
                                                  @PathVariable("idLigneCommande") Integer idLigneCommande);

  /**
   * Find an order by its ID.
   *
   * @param idCommandeClient The ID of the order.
   * @return The order with the specified ID.
   */
  @GetMapping(APP_ROOT + "/commandesclients/{idCommandeClient}")
  ResponseEntity<CommandeClientDto> findById(@PathVariable Integer idCommandeClient);

  /**
   * Find an order by its code.
   *
   * @param code The code of the order.
   * @return The order with the specified code.
   */
  @GetMapping(APP_ROOT + "/commandesclients/filter/{codeCommandeClient}")
  ResponseEntity<CommandeClientDto> findByCode(@PathVariable("codeCommandeClient") String code);

  /**
   * Find all orders.
   *
   * @return A list of all orders.
   */
  @GetMapping(APP_ROOT + "/commandesclients/all")
  ResponseEntity<List<CommandeClientDto>> findAll();

  /**
   * Find all lines of a client order.
   *
   * @param idCommande The ID of the order.
   * @return A list of lines for the specified order.
   */
  @GetMapping(APP_ROOT + "/commandesclients/lignesCommande/{idCommande}")
  ResponseEntity<List<LigneCommandeClientDto>> findAllLignesCommandesClientByCommandeClientId(@PathVariable("idCommande") Integer idCommande);

  /**
   * Delete an order by its ID.
   *
   * @param idCommandeClient The ID of the order to delete.
   */
  @DeleteMapping(APP_ROOT + "/commandesclients/delete/{idCommandeClient}")
  ResponseEntity<Void> delete(@PathVariable("idCommandeClient") Integer idCommandeClient);
}
