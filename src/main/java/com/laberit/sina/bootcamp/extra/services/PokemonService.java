package com.laberit.sina.bootcamp.extra.services;

import com.laberit.sina.bootcamp.extra.models.pokemon.Pokemon;

public interface PokemonService {
    Pokemon getPokemon(String name);

    Pokemon getPokemon(int id);
}
