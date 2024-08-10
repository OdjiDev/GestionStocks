//package com.odji.spring_back_end.controller;
//
//import com.odji.spring_back_end.controller.api.EntrepriseApi;
//import com.odji.spring_back_end.dto.EntrepriseDto;
//import com.odji.spring_back_end.services.EntrepriseService;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class EntrepriseController implements EntrepriseApi {
//
//  private EntrepriseService entrepriseService;
//
//  @Autowired
//  public EntrepriseController(EntrepriseService entrepriseService) {
//    this.entrepriseService = entrepriseService;
//  }
//
//  @Override
//  public EntrepriseDto save(EntrepriseDto dto) {
//    return entrepriseService.save(dto);
//  }
//
//  @Override
//  public EntrepriseDto findById(Integer id) {
//    return entrepriseService.findById(id);
//  }
//
//  @Override
//  public List<EntrepriseDto> findAll() {
//    return entrepriseService.findAll();
//  }
//
//  @Override
//  public void delete(Integer id) {
//    entrepriseService.delete(id);
//  }
//}
