package com.Kmous.gestionDeStock.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ventes")
public class Ventes extends AbstractEntity{


    @Column(name = "code")
    private String code;

    @Column(name = "nom")
    private Instant dateVente;

    @Column(name = "commentaire")
    private String commentaire;

    @Column(name = "codeFiscal")
    private String codeFiscal;

    @Column(name = "photo")
    private String photo;

    @Column(name = "numTel")
    private String numTel;

    @Column(name = "steWeb")
    private String steWeb;
}
