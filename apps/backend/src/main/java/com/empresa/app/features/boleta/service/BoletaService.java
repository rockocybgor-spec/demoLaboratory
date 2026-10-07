package com.empresa.app.features.boleta.service;

import com.empresa.app.features.boleta.dto.BoletaDefaultDto;
import com.empresa.app.features.boleta.entity.Boleta;

import java.util.List;

public interface BoletaService {
    List<BoletaDefaultDto> listaBoletasDCasilla(String dCasilla);
    Boleta obtenerPorFolioBoleta(String folioBoleta);
}