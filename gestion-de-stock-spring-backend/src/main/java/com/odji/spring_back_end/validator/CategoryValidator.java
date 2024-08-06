package com.odji.spring_back_end.validator;

import com.odji.spring_back_end.dto.CategoryDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.util.StringUtils;

public class CategoryValidator {

  public static List<String> validate(CategoryDto categoryDto) {
    List<String> errors = new ArrayList<>();

    if (categoryDto == null || !StringUtils.hasLength(categoryDto.getCode())) {
      errors.add("Veuillez renseigner le code de la categorie");
    }
    return errors;
  }

}
