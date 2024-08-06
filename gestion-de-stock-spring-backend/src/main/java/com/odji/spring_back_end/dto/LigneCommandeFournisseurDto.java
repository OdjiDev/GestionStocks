package com.odji.spring_back_end.dto;
import com.odji.spring_back_end.model.CommandeFournisseur;
import  com.odji.spring_back_end.model.LigneCommandeFournisseur;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeFournisseurDto {

  private Integer id;

  private ArticleDto article;

  private CommandeFournisseur commandeFournisseur;

  private BigDecimal quantite;

  private BigDecimal prixUnitaire;

  private Integer idEntreprise;

  public static LigneCommandeFournisseurDto fromEntity(LigneCommandeFournisseur ligneCommandeFournisseur) {
    if (ligneCommandeFournisseur == null) {
      return null;
    }
    return LigneCommandeFournisseurDto.builder()
        .id(ligneCommandeFournisseur.getId())
        .article(ArticleDto.fromEntity(ligneCommandeFournisseur.getArticle()))
        .quantite(ligneCommandeFournisseur.getQuantite())
        .prixUnitaire(ligneCommandeFournisseur.getPrixUnitaire())
        .idEntreprise(ligneCommandeFournisseur.getIdEntreprise())
        .build();
  }

  public static LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDto dto) {
    if (dto == null) {
      return null;
    }

    LigneCommandeFournisseur ligneCommandeFournisseur = new LigneCommandeFournisseur();
    ligneCommandeFournisseur.setId(dto.getId());
    ligneCommandeFournisseur.setArticle(ArticleDto.toEntity(dto.getArticle()));
    ligneCommandeFournisseur.setPrixUnitaire(dto.getPrixUnitaire());
    ligneCommandeFournisseur.setQuantite(dto.getQuantite());
    ligneCommandeFournisseur.setIdEntreprise(dto.getIdEntreprise());
    return ligneCommandeFournisseur;
  }

}
