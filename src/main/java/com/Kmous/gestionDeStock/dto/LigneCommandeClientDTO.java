package com.Kmous.gestionDeStock.dto;


import com.Kmous.gestionDeStock.model.LigneCommandeClient;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;


import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeClientDTO {

    private Integer id;

    @JsonIgnore
    private ArticleDTO articleDTO;

    @JsonIgnore
    private CommandeClientDTO commandeClientDTO;


    private BigDecimal quantite;


    private BigDecimal prixUnitaire;

    public static LigneCommandeClientDTO fromEntity(LigneCommandeClient ligneCommandeClient){

        if(ligneCommandeClient == null){
            return null;
        }

        return LigneCommandeClientDTO.builder()
                .quantite(ligneCommandeClient.getQuantite())
                .prixUnitaire(ligneCommandeClient.getPrixUnitaire())
                .build();
    }

    public static LigneCommandeClient toEntity(LigneCommandeClientDTO ligneCommandeClientDTO){

        if (ligneCommandeClientDTO == null){
            return null;
        }

        LigneCommandeClient ligneCommandeClient=new LigneCommandeClient();
        ligneCommandeClient.setQuantite(ligneCommandeClientDTO.getQuantite());
        ligneCommandeClient.setPrixUnitaire(ligneCommandeClientDTO.getPrixUnitaire());
        return ligneCommandeClient;
    }
    
}
