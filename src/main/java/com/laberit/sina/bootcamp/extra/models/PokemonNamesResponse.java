package com.laberit.sina.bootcamp.extra.models;

import java.util.List;

public class PokemonNamesResponse {
    private int count;
    private String next;
    private String previous;
    private List<PokemonNamesResult> results;

    public PokemonNamesResponse() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<PokemonNamesResult> getResults() {
        return results;
    }

    public void setResults(List<PokemonNamesResult> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "PokemonResponse{" +
                "count=" + count +
                ", next='" + next + '\'' +
                ", previous='" + previous + '\'' +
                ", results=" + results +
                '}';
    }
}
