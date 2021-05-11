package com.Kmous.gestionDeStock.dto;

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


    private List<CommandeFournisseurDTO> commandeFournisseursDTO;
}
