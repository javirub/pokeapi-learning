package com.laberit.sina.bootcamp.extra.models;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PokemonNames {
    private String name;
    private String url;
    private int id;

    public PokemonNames(String name, String url) {
        this.name = name;
        this.url = url;
        this.id = extractId(url);
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
        return "PokemonNames{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", id=" + id +
                '}';
    }

    private int extractId(String url){
        Pattern pattern = Pattern.compile(".*/(\\d+)/?");
        Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            // Extraemos el último grupo que es el número
            return Integer.parseInt(matcher.group(1));
        } else {
            return 0;
        }
    }

}
