package com.empresa.app.features.representantePartido.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.empresa.app.features.representantePartido.entity.RepresentantePartido;

@Repository 
public interface RepresentantePartidoRepository extends JpaRepository<RepresentantePartido, String> {
    RepresentantePartido findByIdElector(String idElector);
    
}
