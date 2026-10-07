package com.empresa.app.features.funcionarioCasilla.entity;

import com.empresa.app.features.elector.entity.Elector;
import jakarta.persistence.*;

@Entity
@Table (name = "FUNCIONARIOCASILLA")
@PrimaryKeyJoinColumn(name = "dElector")
@DiscriminatorValue("FUNCIONARIOCASILLA")
public class FuncionarioCasilla extends Elector {

    @Column (name = "idElector")
    private String dElector;
    
    @Column(name = "dCasilla")
    private String dCasilla;

    @Column(name = "confirma")
    private Boolean confirma;

    public String getdCasilla() {
        return dCasilla;
    }

    public void setdCasilla(String dCasilla) {
        this.dCasilla = dCasilla;
    }

    public Boolean getConfirma() {
        return confirma;
    }

    public void setConfirma(Boolean confirma) {
        this.confirma = confirma;
    }

    public FuncionarioCasilla(String idElector, String dCasilla, Boolean confirma, String dElector) {
        this.dElector = idElector;
        this.dCasilla = dCasilla;
        this.confirma = confirma;
    }

}
