package com.Kmous.gestionDeStock.dto;


import com.Kmous.gestionDeStock.model.CommandeFournisseur;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeFournisseurDTO {

    private Integer id;

    private String code;


    private Instant dateCommande;

    @JsonIgnore
    private EntrepriseDTO fournisseurDTO;

    @JsonIgnore
    private List<LigneCommandeFournisseurDTO> ligneCommandeFournisseursDTO;

    public CommandeFournisseurDTO fromEntity(CommandeFournisseur commandeFournisseur){
        if(commandeFournisseur == null){
            return null;
        }
        return CommandeFournisseurDTO.builder()
                .code(commandeFournisseur.getCode())
                .dateCommande(commandeFournisseur.getDateCommande())
                .build();
    }
    public CommandeFournisseur toEntity(CommandeFournisseurDTO commandeFournisseurDTO){
        if (commandeFournisseurDTO == null){
            return null;
        }

        CommandeFournisseur commandeFournisseur=new CommandeFournisseur();
        commandeFournisseur.setCode(commandeFournisseurDTO.getCode());
        commandeFournisseur.setDateCommande(commandeFournisseurDTO.getDateCommande());
        return commandeFournisseur;
    }
}
