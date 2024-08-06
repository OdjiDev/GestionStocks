package com.odji.spring_back_end.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "lignecommandefournisseur")
public class LigneCommandeFournisseur  {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @ManyToOne
  @JoinColumn(name = "idarticle")
  private Article article;

  @ManyToOne
  @JoinColumn(name = "idcommandefournisseur")
  private CommandeFournisseur commandeFournisseur;

  @Column(name = "quantite")
  private BigDecimal quantite;

  @Column(name = "prixunitaire")
  private BigDecimal prixUnitaire;

  @Column(name = "identreprise")
  private Integer idEntreprise;

}
