package com.company;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class FindByMap implements FindAble{
private static final List<Movies>jsonMovies=JsonIO.getMovies();
    @Override
    public void findMoviesByActor(List<Movies> movies,String name) {
        jsonMovies.stream().filter(movies1 -> {
            List<Cast> cast = movies1.getCast();
            List<String> stringStream = cast.stream().map(Cast::getFullName).toList();
            return stringStream.contains(name);
        }).forEach(System.out::println);
    }

    @Override
    public void findMoviesByDirector(List<Movies> movies,String director) {
     jsonMovies.stream().filter(movies1 -> movies1.getDirector().getFullName().
             equals(director)).forEach(System.out::println);
    }


    public void findMoviesByYear(List<Movies> movies, int year) {
jsonMovies.stream().filter(movies1 -> movies1.getYear()==year).forEach(System.out::println);
    }

    @Override
    public void findMoviesAndRoleByActor(List<Movies> movies) {
    //  jsonMovies.stream().map(movies1 -> movies1.getName()).forEach(System.out::println);
     // jsonMovies.stream().forEach(System.out::println);
    }




    @Override
   public void showActorRoles(List<Movies> movies) {
        jsonMovies.stream().forEach(movies1 -> movies1.printCast());
    }
}

//    List<User> userList = new ArrayList<>(Arrays.asList(
//            new User("John", 33),
//            new User("Robert", 26),
//            new User("Mark", 26),
//            new User("Brandon", 42)));
//
//    List<User> sortedList = userList.stream()
//            .sorted(Comparator.comparingInt(User::getAge))
//            .collect(Collectors.toList());
//
//sortedList.forEach(System.out::println);