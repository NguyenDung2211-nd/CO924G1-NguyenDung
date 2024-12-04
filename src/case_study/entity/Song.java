package case_study.entity;

public class Song {
    private int id;
    private String name;
    private String singer;
    private String genre;
    private int releaseYear;

    public Song(int id, String name, String singer, String genre, int releaseYear) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Song(id = " + id + ", name = " + name + ", singer = " + singer + " , genre = " + genre + " , releaseYear = " + releaseYear + ")";
    }
}

