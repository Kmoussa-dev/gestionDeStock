package com.Kmous.gestionDeStock.dto;

import com.Kmous.gestionDeStock.model.Roles;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDTO {

    private Integer id;


    private String roleName;

    @JsonIgnore
    private UtilisateurDTO utilisateurDTO;

    public RolesDTO fromEntity(Roles roles){

        if(roles == null){
            return null;
        }

        return RolesDTO.builder()
                .roleName(roles.getRoleName()).build();
    }

    public Roles toEntity(RolesDTO rolesDTO){

        if(rolesDTO == null){
            return null;
        }

        Roles roles=new Roles();
        roles.setRoleName(rolesDTO.getRoleName());
        return roles;
    }

}
