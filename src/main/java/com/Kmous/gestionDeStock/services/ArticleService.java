package com.Kmous.gestionDeStock.services;

import com.Kmous.gestionDeStock.dto.ArticleDTO;
import com.Kmous.gestionDeStock.model.Article;

import java.util.List;

public interface ArticleService {

    ArticleDTO save(ArticleDTO articleDTO);

    ArticleDTO findById(Integer id);

    ArticleDTO findByCodeArticle(String codeArticle);

    List<ArticleDTO> findAll();

    void delete(Integer id);
}
