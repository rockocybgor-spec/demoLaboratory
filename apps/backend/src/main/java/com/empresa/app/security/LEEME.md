# Capa: Security

## Responsabilidad
Todo lo relacionado con autenticación y autorización.
Trabaja en conjunto con Spring Security y (opcionalmente) JWT.

## Componentes clave
  UserDetailsService    → carga el usuario desde la BD para Spring Security
  JwtTokenProvider      → genera y valida tokens JWT
  JwtAuthFilter         → filtro que intercepta requests y verifica el token
  SecurityConfig        → configura qué rutas son públicas y cuáles protegidas

## Flujo típico
  1. Cliente envía POST /api/auth/login con credenciales
  2. AuthController valida, llama al Service
  3. JwtTokenProvider genera el token
  4. Respuesta: { "token": "eyJ..." }
  5. Cliente incluye el token en Header: Authorization: Bearer eyJ...
  6. JwtAuthFilter intercepta y valida en cada request

## Archivos típicos
  JwtTokenProvider.java
  JwtAuthFilter.java
  CustomUserDetailsService.java
  SecurityConfig.java
