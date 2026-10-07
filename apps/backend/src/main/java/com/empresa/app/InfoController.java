package com.empresa.app;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class InfoController{

    @GetMapping("/about")
    public String about() {
        return "version 1.0.0";
    }

}