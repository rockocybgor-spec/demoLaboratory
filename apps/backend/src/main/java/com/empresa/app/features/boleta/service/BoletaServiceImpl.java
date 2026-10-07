package com.empresa.app.features.boleta.service;

import com.empresa.app.features.boleta.dto.BoletaDefaultDto;
import com.empresa.app.features.boleta.mapper.BoletaMapper;
import com.empresa.app.features.boleta.repository.BoletaRepository;
import com.empresa.app.features.boleta.entity.Boleta;

import java.util.List;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class BoletaServiceImpl implements BoletaService {

    private final BoletaRepository boletaRepository;
    private final BoletaMapper boletaMapper;

    //inyección por constructor evitar @Autowired
    public BoletaServiceImpl(BoletaRepository boletaRepository, BoletaMapper boletaMapper){
        this.boletaRepository = boletaRepository;
        this.boletaMapper = boletaMapper;
    }

    @Override 
    public List<BoletaDefaultDto> listaBoletasDCasilla(String dCasilla){
        return boletaRepository.findByDCasilla(dCasilla)
            .stream()
            .map(boletaMapper::boletaToBoletaDefaultDto)
            .toList();
    }
    
    @Override 
    public Boleta obtenerPorFolioBoleta(String folioBoleta){
        Boleta boleta = boletaRepository.findByFolioBoleta(folioBoleta);
        if (boleta == null) {
            throw new ResourceNotFoundException("Boleta no encontrada: " + folioBoleta);
        }
        
        return boleta;
    }
 
}
