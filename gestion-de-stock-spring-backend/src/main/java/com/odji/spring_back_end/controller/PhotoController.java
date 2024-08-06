//package com.odji.spring_back_end.controller;
//
//import com.odji.spring_back_end.controller.api.PhotoApi;
//import com.odji.spring_back_end.services.strategy.StrategyPhotoContext;
//import com.flickr4java.flickr.FlickrException;
//import java.io.IOException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//@RestController
//public class PhotoController implements PhotoApi {
//
//  //a supprimer apres
//  @Override
//  public Object savePhoto(String context, Integer id, MultipartFile photo, String title) throws IOException, FlickrException {
//    return null;
//  }
////
//  private StrategyPhotoContext strategyPhotoContext;
//
//  @Autowired
//  public PhotoController(StrategyPhotoContext strategyPhotoContext) {
//    this.strategyPhotoContext = strategyPhotoContext;
//  }
//
//  @Override
//  public Object savePhoto(String context, Integer id, MultipartFile photo, String title) throws IOException, FlickrException {
//    return strategyPhotoContext.savePhoto(context, id, photo.getInputStream(), title);
//  }
//}
