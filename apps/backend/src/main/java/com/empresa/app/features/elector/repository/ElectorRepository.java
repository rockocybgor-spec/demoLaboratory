package com.empresa.app.features.elector.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empresa.app.features.elector.entity.Elector;

@Repository 
public interface ElectorRepository extends JpaRepository<Elector, String> {
    Elector findByClaveElector(String claveElector);
    
}
