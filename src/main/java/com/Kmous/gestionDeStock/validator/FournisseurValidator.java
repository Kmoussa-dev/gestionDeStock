package com.Kmous.gestionDeStock.validator;

import com.Kmous.gestionDeStock.dto.FournisseurDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FournisseurValidator {

    public static List<String> validate(FournisseurDTO fournisseurDTO){
        List<String> errors=new ArrayList<>();
        if(fournisseurDTO==null){
            errors.add("Veuillez renseigner le nom du Client");
            errors.add("Veuillez renseigner le prenom du Client");
            errors.add("Veuillez renseigner le mail du Client");
            errors.add("Veuillez renseigner le numérode téléphone du Client");
            return errors;
        }

        if (!StringUtils.hasLength(fournisseurDTO.getNom())){
            errors.add("Veuillez renseigner le nom du Client");
        }
        if (!StringUtils.hasLength(fournisseurDTO.getPrenom())){
            errors.add("Veuillez renseigner le prenom du Client");
        }
        if(!StringUtils.hasLength(fournisseurDTO.getMail())){
            errors.add("Veuillez renseigner le Mail du Cient");
        }
        if(!StringUtils.hasLength(fournisseurDTO.getNumTel())){
            errors.add("Veuillez renseigner le numero de téléphone du Client");
        }

        return errors;
    }
}
