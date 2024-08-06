package com.odji.spring_back_end.controller.api;

import static com.odji.spring_back_end.utils.Constants.APP_ROOT;

import com.odji.spring_back_end.dto.CategoryDto;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Interface for Category API.
 */
public interface CategoryApi {

  /**
   * Save a category.
   *
   * @param dto The category to save.
   * @return The saved or updated category.
   */
  @PostMapping(value = APP_ROOT + "/categories/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  CategoryDto save(@RequestBody CategoryDto dto);

  /**
   * Find a category by ID.
   *
   * @param idCategory The ID of the category.
   * @return The category with the specified ID.
   */
  @GetMapping(value = APP_ROOT + "/categories/{idCategory}", produces = MediaType.APPLICATION_JSON_VALUE)
  CategoryDto findById(@PathVariable("idCategory") Integer idCategory);

  /**
   * Find a category by code.
   *
   * @param codeCategory The code of the category.
   * @return The category with the specified code.
   */
  @GetMapping(value = APP_ROOT + "/categories/filter/{codeCategory}", produces = MediaType.APPLICATION_JSON_VALUE)
  CategoryDto findByCode(@PathVariable("codeCategory") String codeCategory);

  /**
   * Find all categories.
   *
   * @return A list of all categories.
   */
  @GetMapping(value = APP_ROOT + "/categories/all", produces = MediaType.APPLICATION_JSON_VALUE)
  List<CategoryDto> findAll();

  /**
   * Delete a category by ID.
   *
   * @param id The ID of the category to delete.
   */
  @DeleteMapping(value = APP_ROOT + "/categories/delete/{idCategory}")
  void delete(@PathVariable("idCategory") Integer id);
}
