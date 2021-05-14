package com.Kmous.gestionDeStock.dto;

import com.Kmous.gestionDeStock.model.Ventes;
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

    public VentesDTO fromEntity(Ventes ventes){

        if(ventes == null){
            return null;
        }

        return VentesDTO.builder()
                .code(ventes.getCode())
                .dateVente(ventes.getDateVente())
                .commentaire(ventes.getCommentaire())
                .codeFiscal(ventes.getCodeFiscal())
                .photo(ventes.getPhoto())
                .numTel(ventes.getNumTel())
                .steWeb(ventes.getSteWeb())
                .build();
    }

    public Ventes toEntity(VentesDTO ventesDTO){

        if(ventesDTO == null){
            return null;
        }

        Ventes ventes =new Ventes();
        ventes.setCode(ventesDTO.getCode());
        ventes.setPhoto(ventesDTO.getPhoto());
        ventes.setNumTel(ventesDTO.getNumTel());
        ventes.setDateVente(ventesDTO.getDateVente());
        ventes.setCommentaire(ventesDTO.getCommentaire());
        ventes.setSteWeb(ventes.getSteWeb());
        return ventes;
    }
}
