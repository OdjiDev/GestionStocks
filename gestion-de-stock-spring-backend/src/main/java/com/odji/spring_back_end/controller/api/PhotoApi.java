package com.odji.spring_back_end.controller.api;

import static com.odji.spring_back_end.utils.Constants.APP_ROOT;

//import com.flickr4java.flickr.FlickrException;
import java.io.IOException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * Interface for Photo API.
 */
public interface PhotoApi {

  /**
   * Save a photo with the specified context, ID, and title.
   *
   * @param context The context for the photo.
   * @param id The ID associated with the photo.
  // * @param title The title of the photo.
   * @param photo The photo file to be uploaded.
   * @return An object representing the result of the save operation.
   * @throws IOException If there is an error during file upload.
//   * @throws FlickrException If there is an error with Flickr API operations.
   */
  @PostMapping(APP_ROOT + "/save/{id}/{title}/{context}")
  Object savePhoto(@PathVariable("context") String context,
                   @PathVariable("id") Integer id,
                   @RequestPart("file") MultipartFile photo,
                   @PathVariable("title") String title) throws IOException;

  //le bon @PathVariable("title") String title) throws IOException, FlickrException;

}
