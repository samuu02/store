# 2. Diseño

## 2.1. Arquitectura

Para desarrollar Pokémon Store estamos utilizando **Clean Architecture**, una arquitectura que nos permite separar las responsabilidades de la aplicación y organizar el código en diferentes capas.

El objetivo es mantener separada la lógica de negocio de los detalles relacionados con la infraestructura, facilitando así el mantenimiento y la evolución del proyecto.

Además, estamos utilizando **Vertical Slicing** para organizar el código según las funcionalidades de la aplicación.

Actualmente contamos con dos slices:

- **pokemon:** agrupa los componentes relacionados con la gestión de los Pokémon.
- **common:** contiene componentes compartidos que pueden utilizarse desde diferentes partes de la aplicación.

Esta combinación nos permite organizar el proyecto tanto por responsabilidades como por funcionalidades.

## 2.2. Organización del código

Dentro de los slices utilizamos una estructura basada en diferentes capas:

- **application:** contiene los elementos relacionados con la ejecución de los casos de uso y la lógica de aplicación.
- **domain:** agrupa los elementos propios del dominio, como modelos, errores y contratos de repositorios.
- **infraestructure:** contiene los elementos relacionados con la infraestructura, como configuración, base de datos, mappers, web, MVC y validaciones.

Esta separación permite que cada parte del proyecto tenga responsabilidades diferenciadas.

### 2.2.1. Gestión de los datos

Para trabajar con los datos de los Pokémon utilizamos actualmente una implementación simulada del repositorio denominada `PokemonRepositoryMockImpl`.

Esta implementación utiliza un `LinkedHashMap` para almacenar los Pokémon en memoria.

De esta forma podemos trabajar con las operaciones de gestión de Pokémon sin depender todavía de una base de datos real.


## 2.3. Gestión de errores y excepciones

Para gestionar los errores de la aplicación utilizamos un componente denominado `GlobalExceptionHandler`, encargado de centralizar el tratamiento de diferentes excepciones.

Actualmente contempla distintos casos:

- Errores relacionados con las validaciones.
- Excepciones de tipo `NullPointerException`.
- Excepciones genéricas que no cuentan con un tratamiento más específico.

También contamos con `PokemonNotFoundException`, utilizada para representar situaciones en las que no se encuentra un Pokémon. Actualmente, esta excepción termina siendo tratada mediante el manejo genérico.

Además, aplicamos validaciones sobre determinados datos de los Pokémon, como el nombre, el tipo y el precio.

## 2.4. Plan de pruebas

Actualmente realizamos las pruebas de forma manual, ejecutando la aplicación y comprobando directamente su funcionamiento.

Durante estas comprobaciones verificamos que las operaciones disponibles responden correctamente y que los datos se gestionan como esperamos.

Entre las comprobaciones que realizamos se encuentran:

- Consultar los Pokémon.
- Crear nuevos Pokémon.
- Modificar Pokémon existentes.
- Eliminar Pokémon.
- Comprobar el comportamiento de las validaciones.
- Verificar la respuesta de la aplicación ante situaciones de error.

A medida que avancemos en el desarrollo, iremos ampliando las comprobaciones para cubrir las nuevas funcionalidades que incorporemos.

---

[← Anterior: Contexto](01-contexto.md) | [Índice](../README.md) | [Siguiente: Implementación →](03-implementacion.md)