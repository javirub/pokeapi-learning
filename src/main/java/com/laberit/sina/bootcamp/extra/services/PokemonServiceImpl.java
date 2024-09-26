package com.laberit.sina.bootcamp.extra.services;

import com.laberit.sina.bootcamp.extra.api.PokeApiClient;
import com.laberit.sina.bootcamp.extra.models.Pokemon;
import com.laberit.sina.bootcamp.extra.models.PokemonNames;
import com.laberit.sina.bootcamp.extra.models.PokemonNamesResponse;
import com.laberit.sina.bootcamp.extra.models.PokemonNamesResult;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
