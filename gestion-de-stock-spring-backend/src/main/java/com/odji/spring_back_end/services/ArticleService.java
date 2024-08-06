package com.odji.spring_back_end.services;

import com.odji.spring_back_end.dto.ArticleDto;
import com.odji.spring_back_end.dto.LigneCommandeClientDto;
import com.odji.spring_back_end.dto.LigneCommandeFournisseurDto;
import com.odji.spring_back_end.dto.LigneVenteDto;
import java.util.List;

public interface ArticleService {

  ArticleDto save(ArticleDto dto);

  ArticleDto findById(Integer id);

  ArticleDto findByCodeArticle(String codeArticle);

  List<ArticleDto> findAll();

  List<LigneVenteDto> findHistoriqueVentes(Integer idArticle);

  List<LigneCommandeClientDto> findHistoriaueCommandeClient(Integer idArticle);

  List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(Integer idArticle);

  List<ArticleDto> findAllArticleByIdCategory(Integer idCategory);

  void delete(Integer id);

}
