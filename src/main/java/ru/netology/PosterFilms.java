package ru.netology;
public class PosterFilms {
    private String[] films = new  String[0];
    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
          tmp[i] = films[i];
        }
     tmp[tmp.length - 1] = film;
        this.films = tmp;
    }

    public String[] findAll() {
        return films;

    }

    public String[] findLast() {
        String[] tmp =  new String[5];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
       return tmp;
    }
}

