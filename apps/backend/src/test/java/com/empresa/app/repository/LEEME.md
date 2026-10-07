# Tests: Repository

## Objetivo
Verificar queries personalizadas contra una BD real (H2 en memoria).
Comprueba que los métodos de JPA generan el SQL correcto.

## Herramientas
  @DataJpaTest          → carga solo la capa JPA con H2 automático
  TestEntityManager     → inserta datos de prueba directamente
  @Sql                  → ejecuta scripts SQL antes del test

## Archivos típicos
  ProductoRepositoryTest.java
  UsuarioRepositoryTest.java
