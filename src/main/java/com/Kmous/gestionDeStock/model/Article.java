package com.Kmous.gestionDeStock.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "article")
public class Article extends AbstractEntity{

    @Column(name= "article")
    private String codeArticle;

    @Column(name = "designation")
    private String designation;

    @Column(name = "prixUnitaireHt")
    private BigDecimal prixUnivitaireHt;

    @Column(name = "tauxTVA")
    private Integer tauxTVA;

    @Column(name = "prixUnitaireTtc")
    private BigDecimal prixUnitaireTtc;

    @Column(name = "photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Category category;
}
