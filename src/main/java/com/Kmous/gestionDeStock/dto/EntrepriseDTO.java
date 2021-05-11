package com.Kmous.gestionDeStock.dto;

import com.Kmous.gestionDeStock.model.Adresse;

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

    

}
