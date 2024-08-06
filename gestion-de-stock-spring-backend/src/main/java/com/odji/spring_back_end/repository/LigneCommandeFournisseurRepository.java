package com.odji.spring_back_end.repository;

import com.odji.spring_back_end.model.LigneCommandeFournisseur;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneCommandeFournisseurRepository extends JpaRepository<LigneCommandeFournisseur, Integer> {

  List<LigneCommandeFournisseur> findAllByCommandeFournisseurId(Integer idCommande);

  List<LigneCommandeFournisseur> findAllByArticleId(Integer idCommande);
}
