package com.empresa.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class InfoController{

      @Value ("${app.version}")
      private String version;

    @GetMapping("/about")
    public String about() {
        return "VERSION:" + version;
    }

}