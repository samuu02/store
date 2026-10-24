package es.etg.daw.dawes.store.pokemon.application.usecase;

import java.time.LocalDateTime;

import es.etg.daw.dawes.store.pokemon.application.command.EditPokemonCommand;
import es.etg.daw.dawes.store.pokemon.domain.model.Pokemon;

public class EditPokemonUseCase {

    public Pokemon update(EditPokemonCommand comando) {

        Pokemon pokemon = Pokemon.builder()
                                 .id(comando.id())
                                 .foto(comando.foto())
                                 .precio(comando.precio())
                                 .createdAt(LocalDateTime.now()).build();


        return pokemon;
    }
}