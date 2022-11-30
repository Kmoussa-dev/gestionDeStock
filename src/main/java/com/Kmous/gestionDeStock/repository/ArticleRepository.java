package com.Kmous.gestionDeStock.repository;


import com.Kmous.gestionDeStock.model.Article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Integer, Article> {

    Article save(Article article);

    List<Article> findByCustomQuery(String code,String designation );


    @Query(value="select * from article where codearticle = :code",nativeQuery = true)
    List<Article> findByCustomNativeQuery(String code,String designation );


    List<Article> findByCodeArticleIgnoreCaseAndDesignationIgnoreCase(String codeArticle,String designation);
}
