   package com.empresa.app.login;
   import org.springframework.web.bind.annotation.*;
   

@RestController
@CrossOrigin(origins = "*")
public class AccesoController {

    public record AccesoRequest(String nombre, String contrasenia) {}

    @PostMapping("/acceder")
    public String acceder(@RequestBody AccesoRequest request) {
        
        //Es consulta gral?
         //votos?
        // Es Casilla?
           //quién en casilla?
        //Es Consejero Distrital?   
       

        
        
        return "HOLA " + request.nombre();
    }

    @GetMapping("/acceder")
    public String accederPrueba(@RequestBody AccesoRequest request) {
 
       return "HOLA " + request.nombre();
    }
}