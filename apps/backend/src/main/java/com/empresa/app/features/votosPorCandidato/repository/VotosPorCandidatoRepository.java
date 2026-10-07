package com.empresa.app.features.votosPorCandidato.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.empresa.app.features.votosPorCandidato.entity.VotosPorCandidato;

@Repository 
public interface VotosPorCandidatoRepository extends JpaRepository<VotosPorCandidato, String> {
    
}
