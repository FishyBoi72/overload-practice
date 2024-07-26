package org.example;

public class TvShow {
    private String showName;
    private int episodeCount;
    private String genre;

    // Default constructor
    public TvShow() {
        this.showName = "Unknown";
        this.episodeCount = 0;
        this.genre = "Unknown";
    }

    // Constructor with parameters
    public TvShow(String showName, int episodeCount, String genre) {
        this.showName = showName;
        this.episodeCount = episodeCount;
        this.genre = genre;
    }

    public String getShowName() {
        return showName;
    }

    public int getEpisodeCount() {
        return episodeCount;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The name of the show is '" + getShowName() + "', which has " + getEpisodeCount() + " episodes. The genre is " + getGenre() + ".";
    }
}