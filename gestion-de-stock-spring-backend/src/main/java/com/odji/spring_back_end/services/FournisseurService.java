package com.odji.spring_back_end.services;

import com.odji.spring_back_end.dto.FournisseurDto;
import java.util.List;

public interface FournisseurService {

  FournisseurDto save(FournisseurDto dto);

  FournisseurDto findById(Integer id);

  List<FournisseurDto> findAll();

  void delete(Integer id);

}
