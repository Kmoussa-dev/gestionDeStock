package com.Kmous.gestionDeStock.dto;


import com.Kmous.gestionDeStock.model.LigneCommandeClient;
import com.Kmous.gestionDeStock.model.LigneVente;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;


import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDTO {

    private Integer id;

    @JsonIgnore
    private VentesDTO ventesDTO;


    private BigDecimal quantite;


    private BigDecimal prixUnitaire;

    public static LigneVenteDTO fromEntity(LigneVente ligneVente){

        if(ligneVente == null){
            return null;
        }

        return LigneVenteDTO.builder()
                .quantite(ligneVente.getQuantite())
                .prixUnitaire(ligneVente.getPrixUnitaire())
                .build();
    }

    public static LigneVente toEntity(LigneVenteDTO ligneVenteDTO){

        if (ligneVenteDTO == null){
            return null;
        }

        LigneVente ligneVente=new LigneVente();
        ligneVente.setQuantite(ligneVenteDTO.getQuantite());
        ligneVente.setPrixUnitaire(ligneVenteDTO.getPrixUnitaire());
        return ligneVente;
    }
}
