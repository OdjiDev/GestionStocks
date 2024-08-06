package com.odji.spring_back_end.controller;

import com.odji.spring_back_end.controller.api.ArticleApi;
import com.odji.spring_back_end.dto.ArticleDto;
import com.odji.spring_back_end.dto.LigneCommandeClientDto;
import com.odji.spring_back_end.dto.LigneCommandeFournisseurDto;
import com.odji.spring_back_end.dto.LigneVenteDto;
import com.odji.spring_back_end.services.ArticleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController implements ArticleApi {

  private ArticleService articleService;

  @Autowired
  public ArticleController(
      ArticleService articleService
  ) {
    this.articleService = articleService;
  }

  @Override
  public ArticleDto save(ArticleDto dto) {
    return articleService.save(dto);
  }

  @Override
  public ArticleDto findById(Integer id) {
    return articleService.findById(id);
  }

  @Override
  public ArticleDto findByCodeArticle(String codeArticle) {
    return articleService.findByCodeArticle(codeArticle);
  }

  @Override
  public List<ArticleDto> findAll() {
    return articleService.findAll();
  }

  @Override
  public List<LigneVenteDto> findHistoriqueVentes(Integer idArticle) {
    return articleService.findHistoriqueVentes(idArticle);
  }

  @Override
  public List<LigneCommandeClientDto> findHistoriqueCommandeClient(Integer idArticle) {
    return null;
  }


  public List<LigneCommandeClientDto> findHistoriaueCommandeClient(Integer idArticle) {
    return articleService.findHistoriaueCommandeClient(idArticle);
  }

  @Override
  public List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(Integer idArticle) {
    return articleService.findHistoriqueCommandeFournisseur(idArticle);
  }

  @Override
  public List<ArticleDto> findAllArticleByIdCategory(Integer idCategory) {
    return articleService.findAllArticleByIdCategory(idCategory);
  }

  @Override
  public void delete(Integer id) {
    articleService.delete(id);
  }
}
