# Capa: Service

## Responsabilidad
Contiene TODA la lógica de negocio de la aplicación.
Coordina entre repositorios, aplica reglas, maneja transacciones.

## Anotaciones clave
  @Service              → registra el bean en el contexto de Spring
  @Transactional        → delimita transacciones de BD
  @Transactional(readOnly = true) → para consultas (optimización)

## Buenas prácticas
  - Definir una interfaz (ProductoService) e implementarla (ProductoServiceImpl)
  - Usar DTOs como parámetros y retorno, nunca Entidades crudas
  - Un método = una responsabilidad

## Archivos típicos
  ProductoService.java          (interfaz)
  ProductoServiceImpl.java      (implementación)
  UsuarioService.java
  UsuarioServiceImpl.java
