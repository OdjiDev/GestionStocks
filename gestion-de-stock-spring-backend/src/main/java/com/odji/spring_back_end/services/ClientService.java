package com.odji.spring_back_end.services;

import com.odji.spring_back_end.dto.ClientDto;
import com.odji.spring_back_end.dto.ClientDto;

import java.util.List;

public interface ClientService {

  ClientDto save(ClientDto dto);

  ClientDto findById(Integer id);

  List<ClientDto> findAll();

  void delete(Integer id);

}
