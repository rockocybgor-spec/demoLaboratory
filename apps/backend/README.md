# Backend — Spring Boot

API REST construida con Spring Boot siguiendo arquitectura en capas.

## Capas
- controller/  → Recibe peticiones HTTP, delega al service. Solo orquesta, sin lógica de negocio.
- service/     → Lógica de negocio. Transacciones (@Transactional). Usa repositorios y DTOs.
- repository/  → Acceso a datos vía Spring Data JPA. Extiende JpaRepository.
- model/       → Entidades JPA que mapean tablas de la BD (@Entity).
- dto/         → Data Transfer Objects. Desacopla la API del modelo interno.
- config/      → Beans de configuración (CORS, Swagger, seguridad, etc.).
- exception/   → Excepciones personalizadas y @ControllerAdvice global.
- security/    → Configuración de Spring Security, filtros JWT, UserDetailsService.
- util/        → Clases utilitarias y helpers reutilizables.

## Comandos útiles
  mvn spring-boot:run -Dspring-boot.run.profiles=local
  mvn test
  mvn clean package
