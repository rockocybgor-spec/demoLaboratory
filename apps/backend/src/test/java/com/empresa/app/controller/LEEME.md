# Tests: Controller

## Objetivo
Verificar que los endpoints HTTP responden correctamente:
  - Código de estado HTTP (200, 201, 400, 404, etc.)
  - Cuerpo del response (JSON)
  - Validaciones de entrada

## Herramientas
  @WebMvcTest           → carga solo la capa web (sin BD)
  MockMvc               → simula peticiones HTTP sin levantar servidor
  @MockBean             → mockea el Service para aislar el controller
  Mockito               → configura el comportamiento de los mocks

## Archivos típicos
  ProductoControllerTest.java
  UsuarioControllerTest.java
