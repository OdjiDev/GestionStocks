package com.odji.spring_back_end.repository;

import com.odji.spring_back_end.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {

}
