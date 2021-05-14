package com.Kmous.gestionDeStock.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDTO {

    private Integer id;


    private String roleName;


    private UtilisateurDTO utilisateurDTO;

    public RolesDTO fromEntity()

}
