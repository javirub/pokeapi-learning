package com.laberit.sina.bootcamp.extra;

import com.laberit.sina.bootcamp.extra.models.PokemonNames;
import com.laberit.sina.bootcamp.extra.services.PokemonRetrievalService;
import com.laberit.sina.bootcamp.extra.services.PokemonRetrievalServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.laberit.sina.bootcamp.extra.configs.configs.POKEMON_LIMIT;
public class PokemonRetrievalServiceTest {
    @Test
    public void testGetAllPokemons(){
        // Arrange
        PokemonRetrievalService pokemonRetrievalService = new PokemonRetrievalServiceImpl();

        // Act
        List<PokemonNames> pokemons = pokemonRetrievalService.getAllPokemon();

        // Assert
        assertEquals(POKEMON_LIMIT, pokemons.size());
    }

}
