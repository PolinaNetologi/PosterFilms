package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class PosterTest {
    @Test
    public void test() {
        PosterFilms films = new PosterFilms();

        films.add("Movie 1");
        films.add("Movie 2");
        films.add("Movie 3");
        films.add("Movie 4");
        films.add("Movie 5");

        String[] actual = films.findAll();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test2() {
        PosterFilms poster = new PosterFilms();
        poster.add("Movie1");
        poster.add("Movie2");
        poster.add("Movie3");
        poster.add("Movie4");
        poster.add("Movie5");
        poster.findLast();
        String[] expected = {"Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};

        String[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test3() {
        PosterFilms poster = new PosterFilms();
        poster.add("Movie1");
        poster.add("Movie2");
        poster.add("Movie3");
        poster.add("Movie4");
        poster.add("Movie5");
        poster.add("Movie6");
        poster.add("Movie7");
        poster.findLast();
        String[] expected = {"Movie7", "Movie6", "Movie5", "Movie4", "Movie3"};

        String[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test4() {
        PosterFilms poster = new PosterFilms();
        poster.add("Movie1");
        poster.add("Movie2");
        poster.add("Movie3");
        poster.add("Movie4");
        poster.add("Movie5");
        poster.add("Movie6");
        poster.add("Movie7");
        poster.findLast();
        String[] expected = {"Movie7", "Movie6", "Movie5", "Movie4", "Movie3"};

        String[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void test5() {
        PosterFilms poster = new PosterFilms();
        poster.add("Movie1");
        poster.findLast();
        String[] expected = {"Movie1"};

        String[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);
   }
    @Test
    public void test6() {
        PosterFilms poster = new PosterFilms();
        poster.add(null);
        poster.findLast();
        String[] expected = {null};

        String[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
}


