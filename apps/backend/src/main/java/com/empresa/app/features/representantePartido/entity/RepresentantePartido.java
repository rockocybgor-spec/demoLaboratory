package com.empresa.app.features.representantePartido.entity;

import com.empresa.app.features.elector.entity.Elector;

import jakarta.persistence.*;
@Entity
@Table (name = "REPRESENTANTE")
@PrimaryKeyJoinColumn(name = "dElector")
@DiscriminatorValue("REPRESENTANTEPARTIDO")
public class RepresentantePartido extends Elector {

    @Column (name = "idElector")
    private String idElector;

    @Column(name = "dCasilla")
    private String dCasilla;

    @Column(name = "dPartido")
    private String dPartido;

    @Column(name = "confirma")
    private Boolean confirma;

    @Column(name = "protesta")
    private String protesta;

    public String getdCasilla() {
        return dCasilla;
    }

    public void setdCasilla(String dCasilla) {
        this.dCasilla = dCasilla;
    }

    public String getdPartido() {
        return dPartido;
    }

    public void setdPartido(String dPartido) {
        this.dPartido = dPartido;
    }

    public Boolean getConfirma() {
        return confirma;
    }

    public void setConfirma(Boolean confirma) {
        this.confirma = confirma;
    }

    public String getProtesta() {
        return protesta;
    }

    public void setProtesta(String protesta) {
        this.protesta = protesta;
    }

    public RepresentantePartido(String idElector, String dCasilla, String dPartido, Boolean confirma, String protesta, String dElector) {
        this.idElector = idElector;
        this.dCasilla = dCasilla;
        this.dPartido = dPartido;
        this.confirma = confirma;
        this.protesta = protesta;
    }

    public RepresentantePartido() {
    }
}
