package com.Kmous.gestionDeStock.validator;

import com.Kmous.gestionDeStock.dto.UtilisateurDTO;
import org.hibernate.annotations.BatchSize;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {

    public static List<String> validate(UtilisateurDTO utilisateurDTO){
        List<String> errors=new ArrayList<>();

        if(utilisateurDTO==null){
            errors.add("Veuillez renseigner le nom d'utilisateur");
            errors.add("Veuillez renseigner le prenom d'utilisateur");
            errors.add("Veuillez renseigner le mot de passe d'utilisateur");
            errors.add("Veuillez rensegner l'adresse d'utilisateur");
            return errors;
        }

        // On peut ajouter l'annotation @Size avec un min et un max
        if(!StringUtils.hasLength(utilisateurDTO.getNom())){
            errors.add("Veuillez renseigner le nom d'utilisateur");
        }

        if(!StringUtils.hasLength(utilisateurDTO.getPrenom())){
            errors.add("Veuillez renseigner le prenom d'utilisateur");
        }

        if(!StringUtils.hasLength(utilisateurDTO.getMotDepasse())){
            errors.add("Veuillez renseigner le mot de passe d'utilisateur");
        }
        if(!StringUtils.hasLength(utilisateurDTO.getEmail())){
            errors.add("Veuillez renseigner l'Email d'utilisateur");
        }

        if(utilisateurDTO.getAdresseDTO() ==null){
            errors.add("Veuillez rensegner l'adresse d'utilisateur");
        }else {
            if(!StringUtils.hasLength(utilisateurDTO.getAdresseDTO().getAdresse1())){
                errors.add("le champs 'Adresse 1' est obligatoire");
            }
            if(!StringUtils.hasLength(utilisateurDTO.getAdresseDTO().getVille())){
                errors.add("le champs 'Ville' est obligatoire");
            }
            if(!StringUtils.hasLength(utilisateurDTO.getAdresseDTO().getPays())){
                errors.add("le champs 'Pays' est obligatoire");
            }
            if(!StringUtils.hasLength(utilisateurDTO.getAdresseDTO().getCodePostale())){
                errors.add("le champs 'CodePostale' est obligatoire");
            }
        }

        return errors;
    }
}
