# Capa: DTO (Data Transfer Objects)

## Responsabilidad
Desacopla la representación interna (Entidades) de la API pública.
Controla exactamente qué datos entran y salen de la aplicación.

## Tipos de DTOs
  Request DTOs  → datos que llegan del cliente (ej: ProductoRequestDTO)
  Response DTOs → datos que se devuelven al cliente (ej: ProductoResponseDTO)

## Buenas prácticas
  - Usar records de Java 17+ para DTOs inmutables
  - Agregar validaciones con Bean Validation (@NotNull, @Size, @Email)
  - Usar MapStruct o conversión manual en el Service para mapear Entidad ↔ DTO

## Ejemplo con record
  public record ProductoResponseDTO(Long id, String nombre, BigDecimal precio) {}

## Archivos típicos
  ProductoRequestDTO.java
  ProductoResponseDTO.java
  UsuarioResponseDTO.java
  LoginRequestDTO.java
