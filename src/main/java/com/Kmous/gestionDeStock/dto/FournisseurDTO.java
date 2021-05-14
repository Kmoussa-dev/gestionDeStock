package com.Kmous.gestionDeStock.dto;

import com.Kmous.gestionDeStock.model.Entreprise;
import com.Kmous.gestionDeStock.model.Fournisseur;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;


import java.util.List;

@Data
@Builder

public class FournisseurDTO {

    private Integer id;

    private String nom;


    private String prenom;


    private AdresseDTO adresseDTO;


    private String photo;


    private String mail;


    private String numTel;

    @JsonIgnore
    private List<CommandeFournisseurDTO> commandeFournisseursDTO;

    public FournisseurDTO fromEntity(Fournisseur fournisseur){

        if(fournisseur == null){
            return null;
        }

        return FournisseurDTO.builder()
                .nom(fournisseur.getNom())
                .prenom(fournisseur.getPrenom())
                .numTel(fournisseur.getNumTel())
                .mail(fournisseur.getMail())
                .photo(fournisseur.getPhoto())
                .build();
    }

    public Fournisseur toEntity(FournisseurDTO fournisseurDTO){

        if(fournisseurDTO == null){
            return null;
        }

        Fournisseur fournisseur=new Fournisseur();
        fournisseur.setNom(fournisseurDTO.getNom());
        fournisseur.setPrenom(fournisseurDTO.getPrenom());
        fournisseur.setNumTel(fournisseurDTO.getNumTel());
        fournisseur.setMail(fournisseurDTO.getMail());
        fournisseur.setPhoto(fournisseurDTO.getPhoto());
        return fournisseur;
    }

}
