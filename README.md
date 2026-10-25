![Pokemon Store](docs/banner.jpg)

Aplicación desarrollada con **Java y Spring Boot** para gestionar Pokemon, organizada siguiendo los principios de **Clean Architecture** y el enfoque de **Vertical Slicing**.
- Hasta ahora, un slice: Pokemon, con cuatro funcionalidades: crear, listar, borrar y modificar Pokemon.
## Tecnologías
- Java
- Spring Boot
- Maven
- Lombok
## Arquitectura
El proyecto utiliza **Clean Architecture** para separar las responsabilidades y reducir el acoplamiento entre distintas capas.
- **Domain:** contiene el modelo y los datos.
- **Application:** contiene los distintos casos de uso para operar con los datos.
- **Infraestructure:** contiene los componentes necesarios para conectar la aplicación con el exterior.

Además, se usa **Vertical Slicing** para organizar la aplicación en torno a las funcionalidades de negocio de forma vertical.
## Funcionalidad 
- Crear Pokemon
- Obtener listado de Pokemons
- Borrar Pokemon
- Modificar Pokemon
## Ejecución
1. Ejecución de la aplicación
2. Dependiendo de la funcionalidad, tenemos varias formas de usar la aplicación, todas accesibles desde el navegador:
- Crear Pokemon: http://localhost:8080/formulario-crear-pokemon.html
- Obtener listado de Pokemons: http://localhost:8080/pokemons
- Borrar Pokemon: http://localhost:8080/formulario-borrar-pokemon.html
- Editar Pokemon: http://localhost:8080/formulario-editar-pokemon.html