package ru.netologi.domain;

public class Main {

    public static void main(String[] args) {

        String[] names = {
                "Бладшот",
                "Вперёд",
                "Отель 'Белград'",
                "Джентльмены",
                "Человек-невидимка",
                "Тролли. Мировой тур",
                "Номер один"
        };

        String newFilm = "Новый фильм";

        String[] tmp = new String[names.length + 1];

        for (int i = 0; i < names.length; i++) {
            tmp[i] = names[i];
        }
        tmp[tmp.length - 1] = newFilm;
        names = tmp;
    }
}