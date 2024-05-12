package Models;

public class Album {
    private String yearRelease;
    private Artist artist;
    private String title;

    public String getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(String yearRelease) {
        this.yearRelease = yearRelease;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Album(String yearRelease, Artist artist, String title) {
        this.yearRelease = yearRelease;
        this.artist = artist;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Album{" +
                "yearRelease='" + yearRelease + '\'' +
                ", artist=" + artist +
                ", title='" + title + '\'' +
                '}';
    }
}
