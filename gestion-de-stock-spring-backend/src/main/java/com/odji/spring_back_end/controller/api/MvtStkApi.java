package com.odji.spring_back_end.controller.api;

import static com.odji.spring_back_end.utils.Constants.APP_ROOT;

import com.odji.spring_back_end.dto.MvtStkDto;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Interface for Stock Movement API.
 */
public interface MvtStkApi {

  /**
   * Get the current stock level of an article.
   *
   * @param idArticle The ID of the article.
   * @return The current stock level of the article.
   */
  @GetMapping(APP_ROOT + "/mvtstk/stockreel/{idArticle}")
  BigDecimal stockReelArticle(@PathVariable("idArticle") Integer idArticle);

  /**
   * Get the list of stock movements for an article.
   *
   * @param idArticle The ID of the article.
   * @return A list of stock movements for the specified article.
   */
  @GetMapping(APP_ROOT + "/mvtstk/filter/article/{idArticle}")
  List<MvtStkDto> mvtStkArticle(@PathVariable("idArticle") Integer idArticle);

  /**
   * Register an entry of stock.
   *
   * @param dto The details of the stock entry.
   * @return The registered stock movement entry.
   */
  @PostMapping(APP_ROOT + "/mvtstk/entree")
  MvtStkDto entreeStock(@RequestBody MvtStkDto dto);

  /**
   * Register an exit of stock.
   *
   * @param dto The details of the stock exit.
   * @return The registered stock movement exit.
   */
  @PostMapping(APP_ROOT + "/mvtstk/sortie")
  MvtStkDto sortieStock(@RequestBody MvtStkDto dto);

  /**
   * Correct positive stock discrepancy.
   *
   * @param dto The details of the stock correction (positive).
   * @return The registered stock movement correction.
   */
  @PostMapping(APP_ROOT + "/mvtstk/correctionpos")
  MvtStkDto correctionStockPos(@RequestBody MvtStkDto dto);

  /**
   * Correct negative stock discrepancy.
   *
   * @param dto The details of the stock correction (negative).
   * @return The registered stock movement correction.
   */
  @PostMapping(APP_ROOT + "/mvtstk/correctionneg")
  MvtStkDto correctionStockNeg(@RequestBody MvtStkDto dto);

}
