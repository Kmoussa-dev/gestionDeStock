package com.Kmous.gestionDeStock.validator;

import com.Kmous.gestionDeStock.dto.ClientDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientValidator {

    public static List<String> validate(ClientDTO clientDTO){

        List<String> errors=new ArrayList<>();
        if(clientDTO==null){
            errors.add("Veuillez renseigner le nom du Client");
            errors.add("Veuillez renseigner le prenom du Client");
            errors.add("Veuillez renseigner le mail du Client");
            errors.add("Veuillez renseigner le numérode téléphone du Client");
            return errors;
        }

        if (!StringUtils.hasLength(clientDTO.getNom())){
            errors.add("Veuillez renseigner le nom du Client");
        }
        if (!StringUtils.hasLength(clientDTO.getPrenom())){
            errors.add("Veuillez renseigner le prenom du Client");
        }
        if(!StringUtils.hasLength(clientDTO.getMail())){
            errors.add("Veuillez renseigner le Mail du Cient");
        }
        if(!StringUtils.hasLength(clientDTO.getNumTel())){
            errors.add("Veuillez renseigner le numero de téléphone du Client");
        }

        return errors;
    }
}
