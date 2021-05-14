package com.Kmous.gestionDeStock.dto;


import com.Kmous.gestionDeStock.model.Utilisateur;
import com.fasterxml.jackson.annotation.JsonIgnore;
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


    @JsonIgnore
    private EntrepriseDTO entrepriseDTO;

    @JsonIgnore
    private List<RolesDTO> rolesDTO;

    public UtilisateurDTO fromEntity(Utilisateur utilisateur){

        if(utilisateur == null){
            return null;
        }

        return UtilisateurDTO.builder()
                .nom(utilisateur.getNom())
                .prenom(utilisateur.getPrenom())
                .email(utilisateur.getEmail())
                .dateDeNaissance(utilisateur.getDateDeNaissance())
                .motDepasse(utilisateur.getMotDepasse())
                .photo(utilisateur.getPhoto())
                .build();
    }

    public Utilisateur toEntity(UtilisateurDTO utilisateurDTO){

        if(utilisateurDTO == null){
            return null;
        }
        Utilisateur utilisateur=new Utilisateur();
        utilisateur.setNom(utilisateurDTO.getNom());
        utilisateur.setPrenom(utilisateurDTO.getPrenom());
        utilisateur.setEmail(utilisateurDTO.getEmail());
        utilisateur.setPhoto(utilisateurDTO.getPhoto());
        utilisateur.setDateDeNaissance(utilisateurDTO.getDateDeNaissance());
        utilisateur.setMotDepasse(utilisateurDTO.getMotDepasse());
        return utilisateur;

    }
}
