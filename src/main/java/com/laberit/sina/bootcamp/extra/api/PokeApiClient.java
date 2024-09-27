package com.laberit.sina.bootcamp.extra.api;


import com.laberit.sina.bootcamp.extra.models.PokemonNamesResponse;
import com.laberit.sina.bootcamp.extra.models.pokemon.Pokemon;
import com.laberit.sina.bootcamp.extra.utils.JSONParser;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;

import static com.laberit.sina.bootcamp.extra.configs.configs.BASE_URL;
import static com.laberit.sina.bootcamp.extra.configs.configs.POKEMON_LIMIT;

public class PokeApiClient {
    public static PokemonNamesResponse getAllPokemons() {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            String url = BASE_URL + "pokemon?limit=" + POKEMON_LIMIT;
            HttpGet httpGet = new HttpGet(url);
            CloseableHttpResponse response = httpClient.execute(httpGet);
            return JSONParser.toObject(response.getEntity(), PokemonNamesResponse.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Pokemon getPokemon(int id) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            String url = BASE_URL + "pokemon/" + id;
            HttpGet httpGet = new HttpGet(url);
            CloseableHttpResponse response = httpClient.execute(httpGet);
            if (response.getCode() == 404) {
                return null;
            }
            return JSONParser.toObject(response.getEntity(), Pokemon.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Pokemon getPokemon(String name) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            String url = BASE_URL + "pokemon/" + name;
            HttpGet httpGet = new HttpGet(url);
            CloseableHttpResponse response = httpClient.execute(httpGet);
            if (response.getCode() == 404) {
                return null;
            }
            return JSONParser.toObject(response.getEntity(), Pokemon.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
