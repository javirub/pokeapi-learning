package com.laberit.sina.bootcamp.extra.services;

import com.laberit.sina.bootcamp.extra.api.PokeApiClient;
import com.laberit.sina.bootcamp.extra.models.pokemon.Pokemon;

public class PokemonServiceImpl implements PokemonService {

    @Override
    public Pokemon getPokemon(String name) {
        return PokeApiClient.getPokemon(name);
    }

    @Override
    public Pokemon getPokemon(int id) {
        return PokeApiClient.getPokemon(id);
    }
}
