# Capa: Exception

## Responsabilidad
Manejo centralizado de errores. Evita duplicar try-catch
en controllers y services. Devuelve respuestas de error consistentes.

## Componentes clave
  @ControllerAdvice         → intercepta excepciones de toda la app
  @ExceptionHandler(X.class)→ maneja una excepción específica

## Patrón recomendado
  1. Crear excepciones personalizadas (extends RuntimeException)
  2. Crear un ErrorResponseDTO con campo mensaje, código, timestamp
  3. Crear GlobalExceptionHandler con @ControllerAdvice

## Archivos típicos
  RecursoNoEncontradoException.java   → lanza 404
  AccesoDenegadoException.java        → lanza 403
  ValidacionException.java            → lanza 400
  GlobalExceptionHandler.java         → captura todas las anteriores
  ErrorResponseDTO.java               → estructura estándar de error
