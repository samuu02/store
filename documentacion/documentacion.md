### Creación de proyecto: 19/10/2026

- Creación del proyecto inicial, junto con la configuración necesaria para empezar a trabajar.

- Creación de las documentaciones para empezar a documentar el proyecto.

- Adición del método `POST` para introducir Pokemon.

### Adición de método `GET`: 19/10/2026

- Adición del metodo `GET`, con el fin de listar 3 Pokemon (de prueba). Mediante las siguientes clases:
    - Caso de uso `FindPokemonUseCase`: usará el método `findAll()` para devolver la lista de Pokemon.
    - Servicio `FindPokemonService`.

- Además de implementar el método `allPokemon()` en `PokemonController`, lo que nos devolverá la lista.
    - Uso de `map(PokemonMapper::toResponse)` para convertir cada elemento del flujo en un objeto Response.