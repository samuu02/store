package es.etg.daw.dawes.store.pokemon.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import es.etg.daw.dawes.store.pokemon.application.usecase.FindPokemonUseCase;
import es.etg.daw.dawes.store.pokemon.domain.model.Pokemon;

@RequiredArgsConstructor 
@Service 
public class FindPokemonService {
    
    private final FindPokemonUseCase findPokemonUseCase;

    public List<Pokemon> findAll() {
        return findPokemonUseCase.findAll();
    }
}
