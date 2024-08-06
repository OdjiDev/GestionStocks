package com.odji.spring_back_end.repository;

import com.odji.spring_back_end.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
