package com.odji.spring_back_end.controller.api;

import static com.odji.spring_back_end.utils.Constants.APP_ROOT;

import com.odji.spring_back_end.dto.ArticleDto;
import com.odji.spring_back_end.dto.LigneCommandeClientDto;
import com.odji.spring_back_end.dto.LigneCommandeFournisseurDto;
import com.odji.spring_back_end.dto.LigneVenteDto;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Interface pour les opérations CRUD sur les articles.
 */
public interface ArticleApi {

  /**
   * Enregistrer un article.
   * Cette méthode permet d'enregistrer ou de modifier un article.
   *
   * @param dto L'objet article à enregistrer ou modifier.
   * @return L'objet article enregistré ou modifié.
   */
  @PostMapping(value = APP_ROOT + "/articles/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  ArticleDto save(@RequestBody ArticleDto dto);

  /**
   * Rechercher un article par ID.
   * Cette méthode permet de chercher un article par son ID.
   *
   * @param id L'ID de l'article à rechercher.
   * @return L'article trouvé.
   */
  @GetMapping(value = APP_ROOT + "/articles/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
  ArticleDto findById(@PathVariable("idArticle") Integer id);

  /**
   * Rechercher un article par CODE.
   * Cette méthode permet de chercher un article par son CODE.
   *
   * @param codeArticle Le CODE de l'article à rechercher.
   * @return L'article trouvé.
   */
  @GetMapping(value = APP_ROOT + "/articles/filter/{codeArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
  ArticleDto findByCodeArticle(@PathVariable("codeArticle") String codeArticle);

  /**
   * Renvoie la liste des articles.
   * Cette méthode permet de chercher et de renvoyer la liste des articles qui existent dans la BDD.
   *
   * @return La liste des articles.
   */
  @GetMapping(value = APP_ROOT + "/articles/all", produces = MediaType.APPLICATION_JSON_VALUE)
  List<ArticleDto> findAll();

  @GetMapping(value = APP_ROOT + "/articles/historique/vente/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
  List<LigneVenteDto> findHistoriqueVentes(@PathVariable("idArticle") Integer idArticle);

  @GetMapping(value = APP_ROOT + "/articles/historique/commandeclient/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
  List<LigneCommandeClientDto> findHistoriqueCommandeClient(@PathVariable("idArticle") Integer idArticle);

  @GetMapping(value = APP_ROOT + "/articles/historique/commandefournisseur/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
  List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(@PathVariable("idArticle") Integer idArticle);

  @GetMapping(value = APP_ROOT + "/articles/filter/category/{idCategory}", produces = MediaType.APPLICATION_JSON_VALUE)
  List<ArticleDto> findAllArticleByIdCategory(@PathVariable("idCategory") Integer idCategory);

  /**
   * Supprimer un article.
   * Cette méthode permet de supprimer un article par ID.
   *
   * @param id L'ID de l'article à supprimer.
   */
  @DeleteMapping(value = APP_ROOT + "/articles/delete/{idArticle}")
  void delete(@PathVariable("idArticle") Integer id);
}
