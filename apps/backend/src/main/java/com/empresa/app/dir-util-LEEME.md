# Capa: Util

## Responsabilidad
Clases utilitarias y helpers reutilizables en toda la aplicación.
No contienen lógica de negocio ni acceden a la BD.

## Reglas
  - Métodos estáticos o beans sin estado (@Component si se inyectan)
  - Sin dependencias circulares con otras capas
  - Reutilizables entre proyectos

## Archivos típicos
  FechaUtils.java           → formateo y conversión de fechas
  StringUtils.java          → manipulación de cadenas
  PaginacionUtils.java      → helpers para PageRequest de Spring Data
  ConstantesApp.java        → constantes globales (rutas API, mensajes, etc.)
