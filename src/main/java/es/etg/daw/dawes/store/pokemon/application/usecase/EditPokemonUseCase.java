package es.etg.daw.dawes.store.pokemon.application.usecase;

import es.etg.daw.dawes.store.pokemon.application.command.EditPokemonCommand;
import es.etg.daw.dawes.store.pokemon.domain.model.Pokemon;
import es.etg.daw.dawes.store.pokemon.domain.repository.PokemonRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EditPokemonUseCase {

    private final PokemonRepository pokemonRepository;
    private final FindPokemonUseCase findPokemonUseCase;

    public Pokemon update(EditPokemonCommand command) {
    
        Pokemon pokemonExistente = findPokemonUseCase.findById(command.id());

        pokemonExistente.setFoto(command.foto());
        pokemonExistente.setPrecio(command.precio());

        return pokemonRepository.save(pokemonExistente);
    }
}