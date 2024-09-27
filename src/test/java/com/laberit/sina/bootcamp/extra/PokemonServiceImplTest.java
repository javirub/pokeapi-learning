package com.laberit.sina.bootcamp.extra;

import com.laberit.sina.bootcamp.extra.models.pokemon.Pokemon;
import com.laberit.sina.bootcamp.extra.services.PokemonService;
import com.laberit.sina.bootcamp.extra.services.PokemonServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PokemonServiceImplTest {
    // GetPokemon(String) tests
    @Test
    public void testGetPokemonByName() {
        // Arrange
        PokemonService pokemonService = new PokemonServiceImpl();

        // Act
        Pokemon pikachu = pokemonService.getPokemon("pikachu");

        // Assert
        assertEquals("pikachu", pikachu.getName());
        assertEquals(25, pikachu.getId());
        assertEquals(112, pikachu.getBase_experience());
        assertEquals(4, pikachu.getHeight());
        assertEquals(60, pikachu.getWeight());
    }

    @Test
    public void testGetPokemonByNameNotFound() {
        PokemonService pokemonService = new PokemonServiceImpl();
        Pokemon notFound = pokemonService.getPokemon("ningunpokemone");
        assertNull(notFound);
    }
    // GetPokemon(int) tests
    @Test
    public void testGetPokemonById() {
        // Arrange
        PokemonService pokemonService = new PokemonServiceImpl();

        // Act
        Pokemon charizard = pokemonService.getPokemon(6);

        // Assert
        assertEquals("charizard", charizard.getName());
        assertEquals(6, charizard.getId());
        assertEquals(267, charizard.getBase_experience());
        assertEquals(17, charizard.getHeight());
        assertEquals(905, charizard.getWeight());
    }

    @Test
    public void testGetPokemonByIdNotFound() {
        PokemonService pokemonService = new PokemonServiceImpl();
        Pokemon notFound = pokemonService.getPokemon(0);
        assertNull(notFound);
    }
}