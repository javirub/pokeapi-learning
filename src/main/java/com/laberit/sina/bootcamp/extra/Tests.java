package com.laberit.sina.bootcamp.extra;

import com.laberit.sina.bootcamp.extra.models.Pokemon;
import com.laberit.sina.bootcamp.extra.services.PokemonService;
import com.laberit.sina.bootcamp.extra.services.PokemonServiceImpl;

import java.util.List;

public class Tests {
    public static void main(String[] args) {
        PokemonService pokemonService = new PokemonServiceImpl();
        // Obtener los nombres de todos los pokemons
        List< String > pokemonNames = pokemonService.getAllPokemonNames();
        pokemonNames.forEach(System.out::println);

        // Obtener un pokemon por su nombre o por su id
        Pokemon pikachu = pokemonService.getPokemon("pikachu");
        System.out.println(pikachu);
        Pokemon charizard = pokemonService.getPokemon(6);
        System.out.println(charizard);
    }
}
