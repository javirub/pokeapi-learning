package com.laberit.sina.bootcamp.extra.services;

import com.laberit.sina.bootcamp.extra.models.PokemonNames;

import java.util.List;

public interface PokemonRetrievalService {
    List<PokemonNames> getAllPokemon();

    List<String> getAllPokemonNames();
}
