# 7. Manual de usuario

## 7.1. Introducción

En este apartado explicamos cómo utilizar las funcionalidades que ofrece actualmente Pokémon Store.

La aplicación permite consultar el listado de Pokémon, crear nuevos registros, modificar los existentes y eliminarlos.

## 7.2. Acceso a la aplicación

Para utilizar la aplicación, primero debemos ejecutar el proyecto localmente con Spring Boot.

Una vez iniciada, podemos acceder a sus funcionalidades desde el navegador o mediante peticiones HTTP, dependiendo de la operación que queramos realizar.

La aplicación utiliza el puerto `8080` en el entorno local.

## 7.3. Consultar el listado de Pokémon

Para consultar los Pokémon registrados, accedemos a la siguiente dirección desde el navegador:

`http://localhost:8080/pokemons`

Esta dirección permite obtener el listado de Pokémon almacenados en la aplicación.

## 7.4. Crear un Pokémon

Para crear un nuevo Pokémon, accedemos al siguiente formulario:

`http://localhost:8080/formulario-crear-pokemon.html`

Desde este formulario podemos introducir los datos necesarios para registrar un nuevo Pokémon en la aplicación.

## 7.5. Modificar un Pokémon

La modificación de un Pokémon se realiza mediante una petición HTTP `PUT`.

Para ello, podemos utilizar el comando `curl` desde una terminal. Por ejemplo, el siguiente comando modifica el Pokémon con identificador `5`:

```bash
curl -i -X PUT http://localhost:8080/pokemons/5 \
-H "Content-Type: application/json" \
-d '{"nombre":"Pikachu","tipo":"Electrico","foto":"nueva.jpg","precio":25}'
```

En este ejemplo se envían los siguientes datos:

- **nombre:** Pikachu.
- **tipo:** Electrico.
- **foto:** nueva.jpg.
- **precio:** 25.

El identificador incluido en la dirección indica qué Pokémon queremos modificar.

## 7.6. Eliminar un Pokémon

Para eliminar un Pokémon, accedemos al siguiente formulario:

`http://localhost:8080/formulario-borrar-pokemon.html`

Desde este formulario podemos realizar la operación de eliminación de un Pokémon.

---

[← Anterior: Elementos destacables](06-elementos-destacables.md) | [Índice](../README.md) | [Siguiente: Conclusiones](08-conclusiones.md)