package com.empresa.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.app.features.boleta.dto.BoletaCustomDto;
import com.empresa.app.features.boleta.dto.BoletaDefaultDto;
import com.empresa.app.features.boleta.entity.Boleta;
import com.empresa.app.features.boleta.mapper.BoletaMapper;
import com.empresa.app.features.candidato.dto.CandidatoDto;
import com.empresa.app.features.candidato.entity.Candidato;
import com.empresa.app.features.candidato.mapper.CandidatoMapper;

//MAIN
@SpringBootApplication 
public class Application {
    public static void main(String[] args) {
          SpringApplication.run(Application.class, args);
        /*
        Boleta boleta = new Boleta(1, "dCandidato", "casilla", 1, "null", "null", "null", null, 1, null);
        System.out.println("1"+ boleta.toString());

        BoletaDefaultDto boletaDTO = BoletaMapper.INSTANCE.boletaToBoletaDefaultDto(boleta);
        System.out.println("2"+ boletaDTO.BoletaDefaultDtoToString());

        BoletaCustomDto boletaCustomDTO = BoletaMapper.INSTANCE.boletaToBoletaCustomDto(boleta);
        System.out.println("2"+ boletaCustomDTO.BoletaCustomDtoToString());

        Candidato candidato = new Candidato(1, "tipoCandidatura", "entidad", "gradoAcademico", "dElector");
        System.out.println("3"+ candidato.CandidatoToString());
        CandidatoDto candidatoDTO = CandidatoMapper.INSTANCE.aDto(candidato);
        System.out.println("4"+ candidatoDTO.CandidatoDtoToString());
        */
    }
 
}
