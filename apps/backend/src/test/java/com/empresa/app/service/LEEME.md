# Tests: Service

## Objetivo
Verificar la lógica de negocio de forma aislada de la BD.
Son los tests más importantes: aquí vive la lógica crítica.

## Herramientas
  @ExtendWith(MockitoExtension.class)  → habilita Mockito en JUnit 5
  @Mock                                → mockea el Repository
  @InjectMocks                         → inyecta los mocks en el Service
  ArgumentCaptor                       → captura argumentos pasados a mocks
  Assertions (JUnit 5)                 → assertEquals, assertThrows, etc.

## Archivos típicos
  ProductoServiceTest.java
  UsuarioServiceTest.java
