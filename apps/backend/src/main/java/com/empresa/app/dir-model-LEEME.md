# Capa: Model (Entidades JPA)

## Responsabilidad
Representa las tablas de la base de datos como clases Java.
Hibernate usa estas clases para generar y sincronizar el esquema.

## Anotaciones clave
  @Entity               → marca la clase como entidad JPA
  @Table(name="...")    → nombre de la tabla en BD
  @Id                   → clave primaria
  @GeneratedValue       → estrategia de generación de ID
  @Column               → mapeo de columna (nombre, nullable, unique)
  @OneToMany / @ManyToOne / @ManyToMany → relaciones

## Regla de oro
NUNCA exponer entidades directamente en la API. 
Siempre convertirlas a DTOs antes de retornarlas al cliente.

## Archivos típicos
  Producto.java
  Usuario.java
  Rol.java
