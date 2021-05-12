package com.Kmous.gestionDeStock.dto;

import com.Kmous.gestionDeStock.model.Adresse;

import com.Kmous.gestionDeStock.model.Entreprise;
import com.Kmous.gestionDeStock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;


import java.util.List;

@Data
@Builder

public class EntrepriseDTO {

    private Integer id;


    private String nom;


    private String description;


    private Adresse adresse;


    private String codeFiscal;


    private String photo;


    private String email;


    private String numTel;


    private String steWeb;


    private List<UtilisateurDTO> utilisateursDTO;

    public EntrepriseDTO fromEntity(Entreprise entreprise){

        if(entreprise == null){
            return null;
        }

        return EntrepriseDTO.builder()
                .nom(entreprise.getNom())
                .description(entreprise.getDescription())
                .adresse(entreprise.getAdresse())
                .numTel(entreprise.getNumTel())
                .codeFiscal(entreprise.getCodeFiscal())
                .email(entreprise.getEmail())
                .photo(entreprise.getPhoto())
                .steWeb(entreprise.getSteWeb())
                .build();
    }

    public Entreprise toEntity(EntrepriseDTO entrepriseDTO){

        if(entrepriseDTO == null){
            return null;
        }

        Entreprise entreprise=new Entreprise();
        entreprise.setNom(entrepriseDTO.getNom());
        entreprise.setDescription(entrepriseDTO.getDescription());
        entreprise.setAdresse(entrepriseDTO.getAdresse());
        entreprise.setNumTel(entrepriseDTO.getNumTel());
        entreprise.setCodeFiscal(entrepriseDTO.getCodeFiscal());
        entreprise.setEmail(entrepriseDTO.getEmail());
        entreprise.setPhoto(entrepriseDTO.getPhoto());
        entreprise.setSteWeb(entrepriseDTO.getSteWeb());
        return entreprise;
    }

    

}
