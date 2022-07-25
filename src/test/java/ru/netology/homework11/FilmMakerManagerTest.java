package ru.netology.homework11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmMakerManagerTest {

    FilmMaker film1 = new FilmMaker(1, "Евротур", "Комедия", "Ссылка 1");
    FilmMaker film2 = new FilmMaker(2, "Горько", "Комедия", "Ссылка 2");
    FilmMaker film3 = new FilmMaker(3, "Убить Билла", "Боевик", "Ссылка 3");
    FilmMaker film4 = new FilmMaker(4, "Вперед", "Мультфильм", "Ссылка 4");
    FilmMaker film5 = new FilmMaker(5, "Отель Белград", "Комедия", "Ссылка 5");
    FilmMaker film6 = new FilmMaker(6, "Джентельмены", "Боевик", "Ссылка 6");
    FilmMaker film7 = new FilmMaker(7, "Человек-Невидимка", "Ужасы", "Ссылка 7");
    FilmMaker film8 = new FilmMaker(8, "Троли", "Мультфильм", "Ссылка 8");
    FilmMaker film9 = new FilmMaker(9, "Номер один", "Комедия", "Ссылка 9");
    FilmMaker film10 = new FilmMaker(10, "Один дома", "Комедия", "Ссылка 10");
    FilmMaker film11 = new FilmMaker(11, "Один дома 2", "Комедия", "Ссылка 11");
    FilmMaker film12 = new FilmMaker(12, "Лови волну", "Мультфильм", "Ссылка 12");
    FilmMaker film13 = new FilmMaker(13, "Монана", "Мультфиль", "Ссылка 13");
    FilmMaker film14 = new FilmMaker(14, "5 сантиметров в секенду", "Мультфильм", "Ссылка 14");
    FilmMaker film15 = new FilmMaker(15, "Троя", "Боевик", "Ссылка 15");


    @Test
    public void shouldAddOneFilm() {
        FilmMakerManager newFilm = new FilmMakerManager();
        newFilm.addFilm(film1);

        FilmMaker[] expected = {film1};
        FilmMaker[] actual = newFilm.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotAddFilms(){
        FilmMakerManager newFilm = new FilmMakerManager();

        FilmMaker[] expected = { };
        FilmMaker[] actual = newFilm.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLast10Films() {
        FilmMakerManager newFilm = new FilmMakerManager();

        newFilm.addFilm(film1);
        newFilm.addFilm(film2);
        newFilm.addFilm(film3);
        newFilm.addFilm(film4);
        newFilm.addFilm(film5);
        newFilm.addFilm(film6);
        newFilm.addFilm(film7);
        newFilm.addFilm(film8);
        newFilm.addFilm(film9);
        newFilm.addFilm(film10);
        newFilm.addFilm(film11);
        newFilm.addFilm(film12);
        newFilm.addFilm(film13);
        newFilm.addFilm(film14);
        newFilm.addFilm(film15);

        FilmMaker[] expected = {film15, film14, film13, film12, film11, film10, film9, film8, film7, film6};
        FilmMaker[] actual = newFilm.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldLast10FilmsWithMyLimit() {
        FilmMakerManager newFilm = new FilmMakerManager(8);

        newFilm.addFilm(film1);
        newFilm.addFilm(film2);
        newFilm.addFilm(film3);
        newFilm.addFilm(film4);
        newFilm.addFilm(film5);
        newFilm.addFilm(film6);
        newFilm.addFilm(film7);
        newFilm.addFilm(film8);
        newFilm.addFilm(film9);
        newFilm.addFilm(film10);
        newFilm.addFilm(film11);
        newFilm.addFilm(film12);
        newFilm.addFilm(film13);
        newFilm.addFilm(film14);
        newFilm.addFilm(film15);

        FilmMaker[] expected = {film15, film14, film13, film12, film11, film10, film9, film8};
        FilmMaker[] actual = newFilm.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotLast10Films() {
        FilmMakerManager newFilm = new FilmMakerManager();

        FilmMaker[] expected = {};
        FilmMaker[] actual = newFilm.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotLast10FilmsWithMyLimit() {
        FilmMakerManager newFilm = new FilmMakerManager(8);

        FilmMaker[] expected = {};
        FilmMaker[] actual = newFilm.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMoreThanLimitFilms() {
        FilmMakerManager newFilm = new FilmMakerManager();
        newFilm.addFilm(film1);
        newFilm.addFilm(film2);
        newFilm.addFilm(film3);
        newFilm.addFilm(film4);
        newFilm.addFilm(film5);
        newFilm.addFilm(film6);
        newFilm.addFilm(film7);
        newFilm.addFilm(film8);
        newFilm.addFilm(film9);
        newFilm.addFilm(film10);
        newFilm.addFilm(film11);

        FilmMaker[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        FilmMaker[] actual = newFilm.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddLessThanLimitFilms() {
        FilmMakerManager newFilm = new FilmMakerManager();
        newFilm.addFilm(film1);
        newFilm.addFilm(film2);
        newFilm.addFilm(film3);
        newFilm.addFilm(film4);
        newFilm.addFilm(film5);
        newFilm.addFilm(film6);
        newFilm.addFilm(film7);
        newFilm.addFilm(film8);
        newFilm.addFilm(film9);

        FilmMaker[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9};
        FilmMaker[] actual = newFilm.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddLimitFilms() {
        FilmMakerManager newFilm = new FilmMakerManager();
        newFilm.addFilm(film1);
        newFilm.addFilm(film2);
        newFilm.addFilm(film3);
        newFilm.addFilm(film4);
        newFilm.addFilm(film5);
        newFilm.addFilm(film6);
        newFilm.addFilm(film7);
        newFilm.addFilm(film8);
        newFilm.addFilm(film9);
        newFilm.addFilm(film10);

        FilmMaker[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        FilmMaker[] actual = newFilm.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
