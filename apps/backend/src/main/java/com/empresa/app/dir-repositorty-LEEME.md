# Capa: Repository

## Responsabilidad
Único punto de contacto con la base de datos.
Abstrae las consultas usando Spring Data JPA.

## Anotaciones clave
  @Repository           → marca como componente de acceso a datos
  Extiende JpaRepository<Entidad, TipoId> para CRUD automático

## Cuándo escribir queries personalizadas
  - Método nombrado:  findByNombreAndActivo(String nombre, boolean activo)
  - @Query JPQL:      @Query("SELECT p FROM Producto p WHERE p.precio > :min")
  - @Query nativa:    @Query(value="SELECT ...", nativeQuery=true)

## Archivos típicos
  ProductoRepository.java
  UsuarioRepository.java
