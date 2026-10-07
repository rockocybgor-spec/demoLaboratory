package com.empresa.app.features.partido.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.empresa.app.features.partido.entity.Partido;

@Repository 
public interface PartidoRepository extends JpaRepository<Partido, String> {
    Partido findByNombrePartido(String nombrePartido);
    
}
