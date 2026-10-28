package es.etg.daw.dawes.store.pokemon.application.usecase;

import java.time.LocalDateTime;

import es.etg.daw.dawes.store.pokemon.application.command.EditPokemonCommand;
import es.etg.daw.dawes.store.pokemon.domain.model.Pokemon;
import es.etg.daw.dawes.store.pokemon.domain.repository.PokemonRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor 
public class EditPokemonUseCase {

    private PokemonRepository pokemonRepository;

    public Pokemon update(EditPokemonCommand comando) {

        Pokemon pokemon = Pokemon.builder()
                                 .id(comando.id())
                                 .foto(comando.foto())
                                 .precio(comando.precio())
                                 .createdAt(LocalDateTime.now()).build();

        return pokemonRepository.save(pokemon);

    }
}