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

    private Integer tauxTVA;

    private BigDecimal prixUnitaireTtc;

    private String photo;

    @JsonIgnore
    private CategoryDTO categoryDTO;

    public static ArticleDTO fromEntity(Article article){
        if(article == null){
            return null;
        }

        return ArticleDTO.builder()
                .codeArticle(article.getCodeArticle())
                .designation(article.getCodeArticle())
                .prixUnivitaireHt(article.getPrixUnivitaireHt())
                .tauxTVA(article.getTauxTVA())
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .photo(article.getPhoto())
                .build();
    }

    public static Article toEntity(ArticleDTO articleDTO){

        if(articleDTO == null){
            return null;
        }

        Article article=new Article();
        article.setCodeArticle(articleDTO.getCodeArticle());
        article.setDesignation(articleDTO.getDesignation());
        article.setPrixUnivitaireHt(articleDTO.getPrixUnivitaireHt());
        article.setTauxTVA(articleDTO.getTauxTVA());
        article.setPrixUnitaireTtc(articleDTO.getPrixUnitaireTtc());
        article.setPhoto(articleDTO.getPhoto());
        return article;

    }
}
