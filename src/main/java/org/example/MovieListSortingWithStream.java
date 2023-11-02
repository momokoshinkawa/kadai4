package org.example;

import java.time.LocalDate;
import java.util.*;

public class MovieListSortingWithStream {
    public static void main(String[] args) {
        Movie movie1 = new Movie("STAR WARS", LocalDate.of(1978, 6, 30), 7753);
        Movie movie2 = new Movie("TITANIC", LocalDate.of(1997, 12, 20), 21853);
        Movie movie3 = new Movie("AVATAR", LocalDate.of(2009, 12, 18), 27879);

        List<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);

        Map<String, String> FilmIntroduction = new HashMap<>();
        FilmIntroduction.put("STAR WARS", "SF映画の金字塔!");
        FilmIntroduction.put("TITANIC", "永遠に語り継がれる恋愛映画");
        FilmIntroduction.put("AVATAR", "映像美が圧巻！歴代興行収入No.1");


        //アルファベット順に並べ替え
        movieList.stream().sorted(Comparator.comparing(Movie::getTitle))
                .forEach(movie -> System.out.println(movie.getTitle()));


        System.out.println();


        //興行収入順に並べ替え
        movieList.stream().sorted(Comparator.comparing(Movie::getBoxOfficeRevenue).reversed())
                .forEach(movie -> System.out.println(movie.getTitle()));


        System.out.println();


        //小文字に変換してアルファベット順に並べ替え
        movieList.stream().sorted(Comparator.comparing(Movie::getTitle))
                .map(movie -> movie.getTitle().toLowerCase())
                .forEach(System.out::println);


        System.out.println();


//Aから始まる映画の数を数える
        long count = movieList.stream().filter(movie -> movie.getTitle().startsWith("A")).count();
        System.out.println(count);


        System.out.println();


//STAR WARSがあるかどうか
        boolean hasSTARWARS = movieList.stream().anyMatch(movie -> movie.getTitle().equals("STAR WARS"));
        System.out.println(true);

        System.out.println();


//例外処理
        try {
            String title = "LALA LAND";
            String introduction = FilmIntroduction.get(title);

            if (introduction != null) {
                System.out.println(title + "を一言で紹介すると" + "”" + introduction + "”");
            } else {
                System.out.println("Not Found");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

