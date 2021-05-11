package com.Kmous.gestionDeStock.dto;


import lombok.Builder;
import lombok.Data;


import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeClientDTO {

    private Integer id;


    private ArticleDTO articleDTO;


    private CommandeClientDTO commandeClientDTO;


    private BigDecimal quantite;


    private BigDecimal prixUnitaire;
    
}
