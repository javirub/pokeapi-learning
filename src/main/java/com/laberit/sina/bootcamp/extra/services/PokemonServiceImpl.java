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
    public List<PokemonNames> getAllPokemon() {
        PokemonNamesResponse response = PokeApiClient.getAllPokemons();
        List<PokemonNames> pokemonNamesList = new ArrayList<>();

        for (PokemonNamesResult result : response.getResults()) {
            PokemonNames pokemonNames = new PokemonNames(result.getName(), result.getUrl()); // Asumiendo que tienes un constructor en Pokemon
            pokemonNamesList.add(pokemonNames);
        }
        return pokemonNamesList;
    }

    @Override
    public Pokemon getPokemon(String name) {
        return PokeApiClient.getPokemon(name);

    }

    @Override
    public Pokemon getPokemon(int id) {
        return PokeApiClient.getPokemon(id);

    }

    @Override
    public List<String> getAllPokemonNames() {
        PokemonNamesResponse response = PokeApiClient.getAllPokemons();
        return response.getResults().stream()
                .map(PokemonNamesResult::getName)
                .collect(Collectors.toList());
    }
}
