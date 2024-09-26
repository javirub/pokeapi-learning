package com.laberit.sina.bootcamp.extra.models;

public class PokemonNamesResult {
    private String name;
    private String url;

    public PokemonNamesResult() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "PokemonResult{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
