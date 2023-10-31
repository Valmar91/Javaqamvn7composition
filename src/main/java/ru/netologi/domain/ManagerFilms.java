package ru.netologi.domain;

public class ManagerFilms {
    private PurchaseFilm[] films = new PurchaseFilm[0];
    private int limit;

    public ManagerFilms() {
        this.limit = 5;
    }

    public ManagerFilms(int limit) {
        this.limit = limit;
    }

    public void save(PurchaseFilm film) {
        PurchaseFilm[] tmp = new PurchaseFilm[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public PurchaseFilm[] findAll() {
        return films;
    }

    public PurchaseFilm[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        PurchaseFilm[] tmp = new PurchaseFilm[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}

