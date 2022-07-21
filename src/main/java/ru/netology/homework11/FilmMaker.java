package ru.netology.homework11;

public class FilmMaker {
    private int id;
    private String tittle;
    private String filmGenre;
    private String imageUrl;

    public FilmMaker(int id, String tittle, String filmGenre, String imageUrl) {
        this.id = id;
        this.tittle = tittle;
        this.filmGenre = filmGenre;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public String getTittle() {
        return tittle;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setId(int newId) {
        id = newId;
    }

    public void setTittle(String newTittle) {
        tittle = newTittle;
    }

    public void setFilmGenre(String newFilmGenre) {
        filmGenre = newFilmGenre;
    }

    public void setImageUrl(String newImageUrl) {
        imageUrl = newImageUrl;
    }
}
