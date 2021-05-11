package com.Kmous.gestionDeStock.dto;

import lombok.Builder;
import lombok.Data;


import java.time.Instant;

@Data
@Builder
public class VentesDTO {

    private Integer id;

    private String code;


    private Instant dateVente;


    private String commentaire;


    private String codeFiscal;

    private String photo;

    private String numTel;

    private String steWeb;
}
