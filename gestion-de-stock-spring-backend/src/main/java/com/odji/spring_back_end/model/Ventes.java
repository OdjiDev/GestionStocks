package com.odji.spring_back_end.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "ventes")
public class Ventes  {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "code")
  private String code;

  @Column(name = "datevente")
  private Instant dateVente;

  @Column(name = "commentaire")
  private String commentaire;

  @Column(name = "identreprise")
  private Integer idEntreprise;

  @OneToMany(mappedBy = "vente")
  private List<LigneVente> ligneVentes;
}
