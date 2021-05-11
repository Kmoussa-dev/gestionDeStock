package com.Kmous.gestionDeStock.dto;


import com.Kmous.gestionDeStock.model.TypeMvtStck;


import java.math.BigDecimal;
import java.time.Instant;

public class MvtStckDTO {

    private Integer id;

    private Instant dateMvt;


    private BigDecimal quantite;


    private ArticleDTO articleDTO;


    private TypeMvtStck typeMvt;
}
