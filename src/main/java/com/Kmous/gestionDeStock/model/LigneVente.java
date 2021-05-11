package com.Kmous.gestionDeStock.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ligneVente")
public class LigneVente extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "idVente")
    private Ventes vente;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prixUnitaire")
    private BigDecimal prixUnitaire;

}
