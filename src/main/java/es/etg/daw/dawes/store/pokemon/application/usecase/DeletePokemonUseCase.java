package es.etg.daw.dawes.store.pokemon.application.usecase;

import es.etg.daw.dawes.store.pokemon.domain.repository.PokemonRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor 
public class DeletePokemonUseCase {

    private final PokemonRepository pokemonRepository;
    private final FindPokemonUseCase findPokemonUseCase; 

    public void delete(int id) {

        findPokemonUseCase.findById(id);

        pokemonRepository.deteteById(id);
    }
}