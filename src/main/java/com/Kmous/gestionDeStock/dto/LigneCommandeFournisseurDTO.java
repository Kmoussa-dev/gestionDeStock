package com.Kmous.gestionDeStock.dto;


import lombok.Builder;
import lombok.Data;


import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeFournisseurDTO {

    private Integer id;

    private ArticleDTO articleDTO;


    private CommandeFournisseurDTO commandeFournisseurDTO;


    private BigDecimal quantite;


    private BigDecimal prixUnitaire;
}
