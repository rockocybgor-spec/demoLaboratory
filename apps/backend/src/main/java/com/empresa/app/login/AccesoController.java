   package com.empresa.app.login; 
   
   import org.slf4j.Logger;
   import org.slf4j.LoggerFactory;
   import org.springframework.web.bind.annotation.*;
  

@RestController
@CrossOrigin(origins = "*")
public class AccesoController {

   private static final Logger logger = LoggerFactory.getLogger(AccesoController.class);
   


    public record AccesoRequest(String nombre, String contrasenia, String valor) {}

    @PostMapping("/acceder")
    public String acceder(@RequestBody AccesoRequest request) {
        logger.info("Loggin user: {}", request.nombre());
        logger.info("Pantalla: {}", request.valor() );
        //Es consulta gral?
         //votos?
        // Es Casilla?
           //quién en casilla?
        //Es Consejero Distrital?   
       

        
        
        return "HOLA " + request.nombre();
    }

}