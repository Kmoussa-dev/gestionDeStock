package com.Kmous.gestionDeStock.repository;

import com.Kmous.gestionDeStock.model.Article;
import com.sun.jdi.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Integer, Article> {


    List<Article> findByCustomQuery(String code,String designation );
    //List<Article> findByCustomQuery(@Param("code") String c,@Param("designation") String d);Requete JPQL

    @Query(value="select * from article where codearticle = :code",nativeQuery = true)
    List<Article> findByCustomNativeQuery(String code,String designation );
    //native Query sans conversion

    List<Article> findByCodeArticleIgnoreCaseAndDesignationIgnoreCase(String codeArticle,String designation);
}
