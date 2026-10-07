package com.empresa.app.features.votosPorPartido.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.empresa.app.features.votosPorPartido.entity.VotosPorPartido;

@Repository 
public interface VotosPorPartidoRepository extends JpaRepository<VotosPorPartido, String> {
   
}
