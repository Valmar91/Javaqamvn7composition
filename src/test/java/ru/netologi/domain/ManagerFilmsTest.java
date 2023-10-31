package ru.netologi.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ManagerFilmsTest {
    ManagerFilms manager = new ManagerFilms();

    PurchaseFilm film1 = new PurchaseFilm(1, "Бладшот", "боевик");
    PurchaseFilm film2 = new PurchaseFilm(2, "Вперёд", "мультфильм");
    PurchaseFilm film3 = new PurchaseFilm(3, "Отель 'Белград'", "комедия");
    PurchaseFilm film4 = new PurchaseFilm(4, "Джентльмены", "боевик");
    PurchaseFilm film5 = new PurchaseFilm(5, "Человек-невидимка", "ужасы");
    PurchaseFilm film6 = new PurchaseFilm(6, "Тролли.Мировой тур", "мультфильм");
    PurchaseFilm film7 = new PurchaseFilm(7, "Номер один", "комедия");

    @Test
    public void test() {

        PurchaseFilm[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {

        manager.save(film1);

        PurchaseFilm[] actual = manager.findAll();
        PurchaseFilm[] expected = {film1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {

        manager.save(film1);
        manager.save(film2);
        manager.save(film3);

        PurchaseFilm[] actual = manager.findAll();
        PurchaseFilm[] expected = {film1, film2, film3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void testReverse() {

        manager.save(film1);
        manager.save(film2);
        manager.save(film3);

        PurchaseFilm[] actual = manager.findLast();
        PurchaseFilm[] expected = {film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void testReverse5() {

        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);

        PurchaseFilm[] actual = manager.findLast();
        PurchaseFilm[] expected = {film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void testReverse7() {

        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);

        PurchaseFilm[] actual = manager.findLast();
        PurchaseFilm[] expected = {film7, film6, film5, film4, film3};

        Assertions.assertArrayEquals(expected, actual);

    }
}
