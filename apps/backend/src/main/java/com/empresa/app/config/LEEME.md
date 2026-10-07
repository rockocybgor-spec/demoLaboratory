# Capa: Config

## Responsabilidad
Centraliza la configuración técnica de la aplicación mediante
clases anotadas con @Configuration y @Bean.

## Qué va aquí
  - Configuración CORS (para desarrollo con Angular en :4200)
  - Bean de PasswordEncoder (BCrypt)
  - Configuración de Swagger/OpenAPI (documentación de la API)
  - ModelMapper o MapStruct si se usa
  - Configuración de caché, mensajería, etc.

## Archivos típicos
  CorsConfig.java           → permite peticiones desde Angular en desarrollo
  SecurityConfig.java       → cadena de filtros de Spring Security
  SwaggerConfig.java        → documentación OpenAPI 3
  AppConfig.java            → beans generales de la aplicación
