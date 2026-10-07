package com.empresa.app.features.candidato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empresa.app.features.candidato.entity.Candidato;

@Repository 
public interface CandidatoRepository extends JpaRepository<Candidato, String> {
    Candidato findByTipoCandidatura(String tipoCandidatura);
}
