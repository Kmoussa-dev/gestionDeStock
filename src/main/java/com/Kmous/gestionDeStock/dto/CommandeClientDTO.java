package com.Kmous.gestionDeStock.dto;


import com.Kmous.gestionDeStock.model.CommandeClient;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;


import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeClientDTO {

    private Integer id;

    private String code;


    private Instant dateCommande;

    @JsonIgnore
    private ClientDTO clientDTO;

    @JsonIgnore
    private List<LigneCommandeClientDTO> ligneCommandeClientsDTO;

    public CommandeClientDTO fromEntity(CommandeClient commandeClient){

        if(commandeClient == null){
            return null;
        }

        return CommandeClientDTO.builder()
                .code(commandeClient.getCode())
                .dateCommande(commandeClient.getDateCommande())
                .build();

    }

    public CommandeClient toEntity(CommandeClientDTO commandeClientDTO){

        if(commandeClientDTO == null){
            return null;
        }

        CommandeClient commandeClient=new CommandeClient();
        commandeClient.setCode(commandeClientDTO.getCode());
        commandeClient.setDateCommande(commandeClientDTO.dateCommande);
        return commandeClient;
    }
}
