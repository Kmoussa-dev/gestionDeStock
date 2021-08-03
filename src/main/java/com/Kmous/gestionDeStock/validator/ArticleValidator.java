package com.Kmous.gestionDeStock.validator;

import com.Kmous.gestionDeStock.dto.ArticleDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {

    public static List<String> validate(ArticleDTO articleDTO){
        List<String> errors =new ArrayList<>();

        if(articleDTO ==null){
            errors.add("Veuillez renseigner le code de l'article");
            errors.add("Veuillez renseigner la designation de l'article");
            errors.add("Veuillez renseigner le prix unitaire HT de l'article");
            errors.add("Veuillez renseigner le Taux de la TVA");
            errors.add("Veuillez renseigner le prix unitaire TTC de l'article");
            errors.add("Veuillez renseigner une categorie");
            return errors;
        }

        if(!StringUtils.hasLength(articleDTO.getCodeArticle())){
            errors.add("Veuillez renseigner le code de l'article");
        }
        if(!StringUtils.hasLength((articleDTO.getDesignation()))){
            errors.add("Veuillez renseigner la designation de l'article");
        }
        if(articleDTO.getPrixUnivitaireHt()==null){
            errors.add("Veuillez renseigner le prix unitaire HT de l'article");
        }
        if(articleDTO.getTauxTVA()==null){
            errors.add("Veuillez renseigner le Taux de la TVA");
        }
        if(articleDTO.getPrixUnitaireTtc()==null){
            errors.add("Veuillez renseigner le prix unitaire TTC de l'article");
        }
        if (articleDTO.getCategoryDTO() == null){
            errors.add("Veuillez renseigner une categorie");
        }

    return errors;
    }
}
