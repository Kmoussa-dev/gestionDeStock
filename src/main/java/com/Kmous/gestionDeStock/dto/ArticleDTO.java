package com.Kmous.gestionDeStock.dto;


import com.Kmous.gestionDeStock.model.Article;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;


import java.math.BigDecimal;

@Data
@Builder
public class ArticleDTO {

    private Integer id;

    private String codeArticle;

    private String designation;

    private BigDecimal prixUnivitaireHt;

    private BigDecimal prixUnitaireTtc;

    private String photo;

    @JsonIgnore
    private CategoryDTO categoryDTO;

    public ArticleDTO fromEntity(Article article){
        if(article == null){
            return null;
        }

        return ArticleDTO.builder()
                .codeArticle(article.getCodeArticle())
                .designation(article.getCodeArticle())
                .prixUnivitaireHt(article.getPrixUnivitaireHt())
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .photo(article.getPhoto())
                .build();
    }

    public Article toEntity(ArticleDTO articleDTO){

        if(articleDTO == null){
            return null;
        }

        Article article=new Article();
        article.setCodeArticle(articleDTO.getCodeArticle());
        article.setDesignation(articleDTO.getDesignation());
        article.setPrixUnivitaireHt(articleDTO.getPrixUnivitaireHt());
        article.setPrixUnitaireTtc(articleDTO.getPrixUnitaireTtc());
        article.setPhoto(articleDTO.getPhoto());
        return article;

    }
}
