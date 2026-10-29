package es.etg.daw.dawes.store.pokemon.application.usecase;

import java.util.List;
import java.util.Optional;

import es.etg.daw.dawes.store.pokemon.domain.error.PokemonNotFoundException;
import es.etg.daw.dawes.store.pokemon.domain.model.Pokemon;
import es.etg.daw.dawes.store.pokemon.domain.repository.PokemonRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor 
public class FindPokemonUseCase {
    
    private PokemonRepository pokemonRepository;

    public List<Pokemon> findAll() {
        List<Pokemon> pokemons = pokemonRepository.getAll();

        if (pokemons.isEmpty()) {
            throw new PokemonNotFoundException();
        }

        return pokemons; 
    }

    public Pokemon findById(int id) {
        Optional<Pokemon> pokemonOpt = pokemonRepository.getById(id);

        if (pokemonOpt.isEmpty()) {
            throw new PokemonNotFoundException(id); 
        }

        return pokemonOpt.get(); 
    }
}