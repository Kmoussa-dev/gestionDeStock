package com.Kmous.gestionDeStock.dto;

import com.Kmous.gestionDeStock.model.MvtStck;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;


import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;
@Data
@Builder
public class MvtStckDTO {

    private Integer id;

    private Instant dateMvt;


    private BigDecimal quantite;

    @JsonIgnore
    private ArticleDTO articleDTO;

    public MvtStckDTO fromEntity(MvtStck mvtStck){
        if (Objects.isNull(mvtStck)){
            return null;
        }
      return MvtStckDTO.builder()
              .id(mvtStck.getId())
              .dateMvt(mvtStck.getDateMvt())
              .quantite(mvtStck.getQuantite())
              .articleDTO(ArticleDTO.fromEntity(mvtStck.getArticle()))
              .build();
    }

    public MvtStck toEntity(MvtStckDTO mvtStckDTO){
        if (Objects.isNull(mvtStckDTO)){
            return null;
        }
        MvtStck mvtStck=new MvtStck();
        mvtStck.setId(mvtStckDTO.getId());
        mvtStck.setDateMvt(mvtStckDTO.getDateMvt());
        mvtStck.setArticle(ArticleDTO.toEntity(mvtStckDTO.getArticleDTO()));
        return mvtStck;
    }

}
