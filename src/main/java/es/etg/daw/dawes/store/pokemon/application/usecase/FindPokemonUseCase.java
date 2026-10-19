package es.etg.daw.dawes.store.pokemon.application.usecase;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import es.etg.daw.dawes.store.pokemon.domain.model.Pokemon;

public class FindPokemonUseCase {
    
    public List<Pokemon> findAll() {
        List<Pokemon> lista = new ArrayList<>();

        lista.add(new Pokemon(1, "Bulbasaur", "Planta", "1", 6, LocalDateTime.now()));
        lista.add(new Pokemon(2, "Charmander", "Fuego", "2", 5, LocalDateTime.now()));
        lista.add(new Pokemon(3, "Squirtle", "Agua", "1", 7, LocalDateTime.now()));

        return lista;
    }
}
