package es.etg.daw.dawes.store.pokemon.infraestructure.web.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NombradoPokemonValidator implements ConstraintValidator<NombradoPokemon, String> {

    public static final String STR_BLANCO = " ";
    public static final String STR_SALTO = "\n";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isEmpty() || value.contains(STR_BLANCO) || value.contains(STR_SALTO)) {
            return false;
        }
        return true;
    }
}