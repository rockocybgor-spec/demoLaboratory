package com.empresa.app;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.empresa.app.login.AccesoController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

public class ServletInitializer extends SpringBootServletInitializer {


   private static final Logger logger = LoggerFactory.getLogger(AccesoController.class);
    
    @Value ("${app.version}")
    private String appVersion;
    @Value("${logging.file.name}")
    private String logPath;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        System.out.println("Logger file path: " + logPath);
        logger.info("Starting application version: {}", appVersion);
        return application.sources(Application.class);
    }

}