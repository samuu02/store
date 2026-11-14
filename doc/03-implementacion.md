# 3. Implementación

## 3.1. Entorno de desarrollo

Para desarrollar Pokémon Store utilizamos diferentes herramientas y tecnologías que nos permiten escribir, organizar, compilar y gestionar el código de la aplicación.

### 3.1.1. Lenguaje y framework

- **Java 17:** lenguaje de programación utilizado para desarrollar la aplicación.
- **Spring Boot 3.3.0:** framework utilizado para construir la aplicación y desarrollar su API REST.

### 3.1.2. Gestión del proyecto y dependencias

Utilizamos **Maven** para gestionar el proyecto y sus dependencias, además de facilitar su compilación y ejecución.

La configuración se encuentra en el fichero `pom.xml`, donde definimos las dependencias, las versiones de las librerías y los plugins necesarios.

Entre las principales dependencias utilizadas encontramos:

| Dependencia | Función |
|---|---|
| Spring Boot Starter Web | Desarrollo de aplicaciones web y API REST. |
| Spring Boot Starter Validation | Validación de datos de entrada. |
| Lombok | Reducción de código repetitivo mediante anotaciones. |
| MapStruct | Conversión entre diferentes objetos del proyecto. |
| Lombok MapStruct Binding | Integración entre Lombok y MapStruct. |

### 3.1.3. Entorno de desarrollo

Utilizamos **Visual Studio Code** como entorno de desarrollo para trabajar con el código fuente de la aplicación.

Desde este entorno realizamos las tareas de programación, modificación y ejecución del proyecto.

### 3.1.4. Control de versiones

Utilizamos **Git** para gestionar las diferentes versiones del código durante el desarrollo.

El proyecto se encuentra alojado en **GitHub**, lo que nos permite mantener un repositorio compartido y trabajar conjuntamente.

Para organizar el trabajo utilizamos **Gitflow**, un flujo de trabajo basado en ramas que permite separar el desarrollo de nuevas funcionalidades de las versiones principales del proyecto.

### 3.1.5. Arquitectura y organización del código

Para organizar el desarrollo utilizamos Clean Architecture y Vertical Slicing.

Actualmente contamos con dos slices:

- `pokemon`
- `common`

Esta organización nos permite separar las funcionalidades y responsabilidades de la aplicación.

### 3.1.6. Documentación

La documentación del proyecto se realiza mediante ficheros Markdown (`.md`), organizados dentro de la carpeta `doc/`.

Además, utilizamos un fichero `README.md` en la raíz del repositorio para presentar el proyecto y facilitar la navegación por los diferentes documentos.

## 3.2. Implantación y puesta en producción

Actualmente ejecutamos la aplicación en local mediante Spring Boot.

Para ello utilizamos las herramientas proporcionadas por Spring Boot y Maven, que permiten compilar y ejecutar el proyecto durante el desarrollo.

La implantación en un entorno de producción no se ha realizado todavía, por lo que este apartado podrá ampliarse cuando se defina un proceso de despliegue.

---

[← Anterior: Diseño](02-diseno.md) | [Índice](../README.md) | [Siguiente: Ejecución y pruebas →](04-ejecucion-y-pruebas.md)