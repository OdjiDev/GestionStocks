package com.odji.spring_back_end.controller.api;

import static com.odji.spring_back_end.utils.Constants.COMMANDE_FOURNISSEUR_ENDPOINT;
import static com.odji.spring_back_end.utils.Constants.CREATE_COMMANDE_FOURNISSEUR_ENDPOINT;
import static com.odji.spring_back_end.utils.Constants.DELETE_COMMANDE_FOURNISSEUR_ENDPOINT;
import static com.odji.spring_back_end.utils.Constants.FIND_ALL_COMMANDE_FOURNISSEUR_ENDPOINT;
import static com.odji.spring_back_end.utils.Constants.FIND_COMMANDE_FOURNISSEUR_BY_CODE_ENDPOINT;
import static com.odji.spring_back_end.utils.Constants.FIND_COMMANDE_FOURNISSEUR_BY_ID_ENDPOINT;

import com.odji.spring_back_end.dto.CommandeFournisseurDto;
import com.odji.spring_back_end.dto.LigneCommandeFournisseurDto;
import com.odji.spring_back_end.model.EtatCommande;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Interface for CommandeFournisseur API.
 */
public interface CommandeFournisseurApi {

  /**
   * Create or update a supplier order.
   *
   * @param dto The order to create or update.
   * @return The created or updated order.
   */
  @PostMapping(CREATE_COMMANDE_FOURNISSEUR_ENDPOINT)
  CommandeFournisseurDto save(@RequestBody CommandeFournisseurDto dto);

  /**
   * Update the status of an order.
   *
   * @param idCommande The ID of the order.
   * @param etatCommande The new status of the order.
   * @return The updated order.
   */
  @PatchMapping(COMMANDE_FOURNISSEUR_ENDPOINT + "/update/etat/{idCommande}/{etatCommande}")
  CommandeFournisseurDto updateEtatCommande(@PathVariable("idCommande") Integer idCommande,
                                            @PathVariable("etatCommande") EtatCommande etatCommande);

  /**
   * Update the quantity of an order line.
   *
   * @param idCommande The ID of the order.
   * @param idLigneCommande The ID of the order line.
   * @param quantite The new quantity.
   * @return The updated order.
   */
  @PatchMapping(COMMANDE_FOURNISSEUR_ENDPOINT + "/update/quantite/{idCommande}/{idLigneCommande}/{quantite}")
  CommandeFournisseurDto updateQuantiteCommande(@PathVariable("idCommande") Integer idCommande,
                                                @PathVariable("idLigneCommande") Integer idLigneCommande,
                                                @PathVariable("quantite") BigDecimal quantite);

  /**
   * Update the supplier associated with an order.
   *
   * @param idCommande The ID of the order.
   * @param idFournisseur The ID of the new supplier.
   * @return The updated order.
   */
  @PatchMapping(COMMANDE_FOURNISSEUR_ENDPOINT + "/update/fournisseur/{idCommande}/{idFournisseur}")
  CommandeFournisseurDto updateFournisseur(@PathVariable("idCommande") Integer idCommande,
                                           @PathVariable("idFournisseur") Integer idFournisseur);

  /**
   * Update the article associated with an order line.
   *
   * @param idCommande The ID of the order.
   * @param idLigneCommande The ID of the order line.
   * @param idArticle The ID of the new article.
   * @return The updated order.
   */
  @PatchMapping(COMMANDE_FOURNISSEUR_ENDPOINT + "/update/article/{idCommande}/{idLigneCommande}/{idArticle}")
  CommandeFournisseurDto updateArticle(@PathVariable("idCommande") Integer idCommande,
                                       @PathVariable("idLigneCommande") Integer idLigneCommande,
                                       @PathVariable("idArticle") Integer idArticle);

  /**
   * Delete an article from an order.
   *
   * @param idCommande The ID of the order.
   * @param idLigneCommande The ID of the order line.
   * @return The updated order.
   */
  @DeleteMapping(COMMANDE_FOURNISSEUR_ENDPOINT + "/delete/article/{idCommande}/{idLigneCommande}")
  CommandeFournisseurDto deleteArticle(@PathVariable("idCommande") Integer idCommande,
                                       @PathVariable("idLigneCommande") Integer idLigneCommande);

  /**
   * Find an order by its ID.
   *
   * @param idCommandeFournisseur The ID of the order.
   * @return The order with the specified ID.
   */
  @GetMapping(FIND_COMMANDE_FOURNISSEUR_BY_ID_ENDPOINT)
  CommandeFournisseurDto findById(@PathVariable("idCommandeFournisseur") Integer id);

  /**
   * Find an order by its code.
   *
   * @param code The code of the order.
   * @return The order with the specified code.
   */
  @GetMapping(FIND_COMMANDE_FOURNISSEUR_BY_CODE_ENDPOINT)
  CommandeFournisseurDto findByCode(@PathVariable("codeCommandeFournisseur") String code);

  /**
   * Find all orders.
   *
   * @return A list of all orders.
   */
  @GetMapping(FIND_ALL_COMMANDE_FOURNISSEUR_ENDPOINT)
  List<CommandeFournisseurDto> findAll();

  /**
   * Find all lines of a supplier order.
   *
   * @param idCommande The ID of the order.
   * @return A list of lines for the specified order.
   */
  @GetMapping(COMMANDE_FOURNISSEUR_ENDPOINT + "/lignesCommande/{idCommande}")
  List<LigneCommandeFournisseurDto> findAllLignesCommandesFournisseurByCommandeFournisseurId(@PathVariable("idCommande") Integer idCommande);

  /**
   * Delete an order by its ID.
   *
   * @param idCommandeFournisseur The ID of the order to delete.
   */
  @DeleteMapping(DELETE_COMMANDE_FOURNISSEUR_ENDPOINT)
  void delete(@PathVariable("idCommandeFournisseur") Integer idCommandeFournisseur);
}
