package com.empresa.app.features.candidato.entity;

import com.empresa.app.features.elector.entity.Elector;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "CANDIDATO")
@Getter 
@Setter
@PrimaryKeyJoinColumn(name = "dElector")
@DiscriminatorValue("CANDIDATO")
public class Candidato extends Elector  {

    @Column (name = "idElector")
    private Integer idElector;

    @Column (name = "tipoCandidatura")
    private String tipoCandidatura;

    @Column (name = "entidad")
    private String entidad;

    @Column (name = "gradoAcademico")
    private String gradoAcademico;

    public Candidato(Integer idElector, String tipoCandidatura, String entidad, String gradoAcademico, String dElector) {
        this.idElector = idElector;
        this.tipoCandidatura = tipoCandidatura;
        this.entidad = entidad;
        this.gradoAcademico = gradoAcademico;
    }

    public String getDElector() {
        return super.getClaveElector();
    }
    
    public String CandidatoToString() {
        return "Candidato [tipoCandidatura=" + tipoCandidatura + ", entidad=" + entidad
                + ", gradoAcademico=" + gradoAcademico + ", dElector=" + getDElector() + "]";
    }
}