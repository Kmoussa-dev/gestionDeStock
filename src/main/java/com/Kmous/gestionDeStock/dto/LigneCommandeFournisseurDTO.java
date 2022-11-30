package com.Kmous.gestionDeStock.dto;


import com.Kmous.gestionDeStock.model.LigneCommandeClient;
import com.Kmous.gestionDeStock.model.LigneCommandeFournisseur;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;


import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeFournisseurDTO {

    private Integer id;

    @JsonIgnore
    private ArticleDTO articleDTO;

    @JsonIgnore
    private CommandeFournisseurDTO commandeFournisseurDTO;


    private BigDecimal quantite;


    private BigDecimal prixUnitaire;

    public static LigneCommandeFournisseurDTO fromEntity(LigneCommandeFournisseur ligneCommandeFournisseur){

        if(ligneCommandeFournisseur == null){
            return null;
        }

        return LigneCommandeFournisseurDTO.builder()
                .quantite(ligneCommandeFournisseur.getQuantite())
                .prixUnitaire(ligneCommandeFournisseur.getPrixUnitaire())
                .build();
    }

    public static LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDTO ligneCommandeFournisseurDTO){

        if (ligneCommandeFournisseurDTO == null){
            return null;
        }

        LigneCommandeFournisseur ligneCommandeFournisseur=new LigneCommandeFournisseur();
        ligneCommandeFournisseur.setQuantite(ligneCommandeFournisseurDTO.getQuantite());
        ligneCommandeFournisseur.setPrixUnitaire(ligneCommandeFournisseurDTO.getPrixUnitaire());
        return ligneCommandeFournisseur;
    }
}
