package com.Kmous.gestionDeStock.dto;

import com.Kmous.gestionDeStock.model.Adresse;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Data
@Builder
public class AdresseDTO {

    private Integer id;

    private String adresse1;


    private String adresse2;


    private String ville;


    private String codePostale;


    private String pays;

    public AdresseDTO fromEntity(Adresse adresse){
        if(adresse == null){
            return null;
        }
        return AdresseDTO.builder()
                .adresse1(adresse.getAdresse1())
                .adresse2(adresse.getAdresse2())
                .codePostale(adresse.getCodePostale())
                .ville(adresse.getVille())
                .pays(adresse.getPays())
                .build();
    }

    public Adresse toEntity(AdresseDTO adresseDTO){
        if(adresseDTO == null){
            return null;
        }
        Adresse adresse = new Adresse();
        adresse.setAdresse1(adresseDTO.getAdresse1());
        adresse.setAdresse2(adresseDTO.getAdresse2());
        adresse.setCodePostale(adresseDTO.getCodePostale());
        adresse.setVille(adresseDTO.getVille());
        adresse.setPays(adresseDTO.getPays());
        return adresse;
    }
}
