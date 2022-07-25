package ru.netology.homework11;

public class FilmMakerManager {

    private FilmMaker[] films = new FilmMaker[0];
    private int limitFilms = 10;

    public FilmMakerManager(int limitFilms) {
        this.limitFilms = limitFilms;
    }

    public FilmMakerManager() {

    }

    public void addFilm(FilmMaker film) {
        FilmMaker[] tmp = new FilmMaker[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public FilmMaker[] findAll() {
        int resultLength = films.length;
        if (resultLength >= limitFilms) {
            resultLength = limitFilms;
        } else {
            resultLength = films.length;
        }
        FilmMaker[] result = new FilmMaker[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = films[i];
        }
        return result;
    }

    public FilmMaker[] findLast() {
        int resultLength = films.length;
        if (resultLength >= limitFilms) {
            resultLength = limitFilms;
        } else {
            resultLength = films.length;
        }
        FilmMaker[] result = new FilmMaker[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = films.length - 1 - i;
            result[i] = films[index];
        }
        return result;
    }
}
