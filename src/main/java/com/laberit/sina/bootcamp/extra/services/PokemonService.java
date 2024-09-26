package com.laberit.sina.bootcamp.extra.services;

import com.laberit.sina.bootcamp.extra.models.Pokemon;
import com.laberit.sina.bootcamp.extra.models.PokemonNames;

import java.util.List;

public interface PokemonService {
    List<PokemonNames> getAllPokemon();

    Pokemon getPokemon(String name);

    Pokemon getPokemon(int id);

    // Method to obtain only names of all pokemons
    List<String> getAllPokemonNames();
}
