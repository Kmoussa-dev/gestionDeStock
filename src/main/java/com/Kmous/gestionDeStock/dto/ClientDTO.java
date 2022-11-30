package com.Kmous.gestionDeStock.dto;

import com.Kmous.gestionDeStock.model.Adresse;

import com.Kmous.gestionDeStock.model.Client;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;


import java.util.List;

@Data
@Builder
public class ClientDTO {

    private Integer id;

    private String nom;


    private String prenom;


    private Adresse adresse;


    private String photo;


    private String mail;


    private String numTel;

    @JsonIgnore
    private List<CommandeClientDTO> commandeClientsDTO;

    public static ClientDTO fromEntity(Client client){

        if (client == null){
            return null;
        }

        return ClientDTO.builder()
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .adresse(client.getAdresse())
                .photo(client.getPhoto())
                .mail(client.getMail())
                .numTel(client.getNumTel())
                .build();
    }

    public static Client toEntity(ClientDTO clientDTO){

        if(clientDTO == null){
            return null;
        }
        Client client=new Client();
        client.setNom(clientDTO.getNom());
        client.setPrenom((clientDTO.getPrenom()));
        client.setAdresse(clientDTO.getAdresse());
        client.setPhoto(clientDTO.getPhoto());
        client.setMail(clientDTO.getMail());
        client.setNumTel(clientDTO.getNumTel());
        return client;

    }
}
