package com.empresa.app.features.funcionarioCasilla.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.empresa.app.features.funcionarioCasilla.entity.FuncionarioCasilla;

@Repository 
public interface FuncionarioCasillaRepository extends JpaRepository<FuncionarioCasilla, String> {
    FuncionarioCasilla findByDElector(String dElector);
    
}
