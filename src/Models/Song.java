package Models;

import Enums.Genres;

public class Song {
    private String name;
    private Double duration;
    private Genres genre;
    private Album album;
    private Artist collab = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Genres getGenre() {
        return genre;
    }

    public void setGenre(Genres genre) {
        this.genre = genre;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artist collab() {
        return collab;
    }

    public void setCollab(Artist collab) {
        this.collab = collab;
    }

    public Song(String name, Double duration, Genres genre, Album album, Artist collab) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        this.album = album;
        this.collab = collab;

    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", genre=" + genre +
                ", album=" + album +
                ", collab=" + collab +
                '}';
    }
}
