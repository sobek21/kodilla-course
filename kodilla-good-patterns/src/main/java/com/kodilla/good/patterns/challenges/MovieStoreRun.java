package com.kodilla.good.patterns.challenges;



import java.util.List;
import java.util.stream.Collectors;

public class MovieStoreRun {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String title = movieStore.getMovies().entrySet().stream().
        flatMap(t -> t.getValue().stream()).
        reduce((film,film1) -> film+ "! "+film1).get();

        System.out.println(title);


    }
}
