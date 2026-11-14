![Pokemon Store](doc/img/banner.jpg)


**Pokémon Store** es una aplicación que estamos desarrollando como proyecto de la asignatura de Entorno Servidor de segundo curso del Ciclo Formativo de Grado Superior de Desarrollo de Aplicaciones Web (DAW).

A través de este proyecto ponemos en práctica los conocimientos adquiridos durante el curso, trabajando en el desarrollo de una aplicación y aplicando diferentes conceptos relacionados con la programación, la arquitectura de software y la organización del código.

**Versión:** 1.0.0

### Integrantes

- David Crisbasianu Petronga
- Álvaro Cabrejas Ormeño
- Samuel Alonso Álvarez

---

## Sobre el proyecto

El desarrollo de Pokémon Store nos permite trabajar con una aplicación organizada mediante **Clean Architecture** y **Vertical Slicing**.

Hemos comenzado organizando el código en dos slices:

- **`pokemon`:** agrupa los elementos relacionados con la funcionalidad de los Pokémon.
- **`common`:** contiene los elementos compartidos por las diferentes partes de la aplicación.

Esta organización nos permite desarrollar el proyecto de forma progresiva, incorporando los conceptos que vamos aprendiendo y aplicándolos directamente sobre el código.

## Funcionalidades

La aplicación cuenta con la gestión de Pokemon mediante los cuatro métodos HTTP:

| Método HTTP | Operación |
|---|---|
| GET | Consultar todos los Pokémon |
| POST | Crear un Pokémon |
| PUT | Modificar un Pokémon |
| DELETE | Eliminar un Pokémon |

## Documentación

En la carpeta [`doc/`](doc/) se encuentra la documentación del proyecto, donde explicamos su contexto, diseño, arquitectura, implementación y otros aspectos relacionados con el desarrollo.

| Apartado | Documento |
|---|---|
| Contexto de la aplicación | [01 - Contexto](doc/01-contexto.md) |
| Diseño | [02 - Diseño](doc/02-diseno.md) |
| Implementación | [03 - Implementación](doc/03-implementacion.md) |
| Ejecución y pruebas | [04 - Ejecución y pruebas](doc/04-ejecucion-y-pruebas.md) |
| Herramientas y versiones | [05 - Herramientas y versiones](doc/05-herramientas-y-versiones.md) |
| Elementos destacables | [06 - Elementos destacables](doc/06-elementos-destacables.md) |
| Manual de usuario | [07 - Manual de usuario](doc/07-manual-de-usuario.md) |
| Conclusiones | [08 - Conclusiones](doc/08-conclusiones.md) |
| Referencias y bibliografía | [09 - Referencias y bibliografía](doc/09-referencias-y-bibliografia.md) |