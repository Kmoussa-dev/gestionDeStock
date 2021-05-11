package com.Kmous.gestionDeStock.dto;


import lombok.Builder;
import lombok.Data;


import java.time.Instant;
import java.util.List;

@Data
@Builder
public class UtilisateurDTO {

    private Integer id;


    private String nom;


    private String prenom;


    private String email;


    private Instant dateDeNaissance;


    private String motDepasse;


    private AdresseDTO adresseDTO;


    private String photo;



    private EntrepriseDTO entrepriseDTO;


    private List<RolesDTO> rolesDTO;

}
