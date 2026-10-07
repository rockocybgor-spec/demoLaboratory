package com.empresa.app.features.boleta.repository;
import com.empresa.app.features.boleta.entity.Boleta;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoletaRepository  extends JpaRepository<Boleta, Long>{
    Boleta findByFolioBoleta(String folio);
    List<Boleta> findByDCasilla(String dCasilla);
}


 