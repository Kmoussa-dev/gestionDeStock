package com.Kmous.gestionDeStock.dto;


import com.Kmous.gestionDeStock.model.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;


import java.util.List;

@Data
@Builder
public class CategoryDTO {

    private Integer id;

    private String code;

    private String designation;

    @JsonIgnore
    private List<ArticleDTO> articlesDTO;

    public CategoryDTO fromEntity(Category category){

        if(category == null){
            return null;
        }

        return CategoryDTO.builder()
                .code(category.getCode())
                .designation(category.getDesignation())
                .build();
    }

    public Category toEntity(CategoryDTO categoryDTO){

        if(categoryDTO == null){
            return null;
        }
        Category category=new Category();
        category.setCode(categoryDTO.getCode());
        category.setDesignation(categoryDTO.getDesignation());
        return category;
    }

}
