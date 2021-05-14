package com.Kmous.gestionDeStock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;


import java.math.BigDecimal;
import java.time.Instant;

public class MvtStckDTO {

    private Integer id;

    private Instant dateMvt;


    private BigDecimal quantite;

    @JsonIgnore
    private ArticleDTO articleDTO;



}
