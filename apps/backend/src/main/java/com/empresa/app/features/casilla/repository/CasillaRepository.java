package com.empresa.app.features.casilla.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.empresa.app.features.casilla.entity.Casilla;


@Repository
public interface CasillaRepository extends JpaRepository<Casilla, String> {
    Casilla findByFolioActaEscrutinio(String folioActaEscrutinio);   
}
