package com.Kmous.gestionDeStock.dto;


import lombok.Builder;
import lombok.Data;


import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDTO {

    private Integer id;


    private VentesDTO ventesDTO;


    private BigDecimal quantite;


    private BigDecimal prixUnitaire;
}
