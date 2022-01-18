package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieStore implements SortAble{
    private static final List<Movies>jsonMovies=JsonIO.getMovies();
    @Override
    public void printAllMovies(List<Movies> movies) {
        jsonMovies.stream().forEach(System.out::println);

    }

    @Override
    public void findMovie(List<Movies> movies,String name) {
        jsonMovies.stream().filter(movies1 -> movies1.getName().equals(name)).forEach(System.out::println);
    }

    @Override
    public void sortByYear(List<Movies> movies) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("кичинеден чонго < 1 > ");
        System.out.println("Чондон кичинеге < 2 > ");
        int number =scanner.nextInt();
        if(number==1){
            jsonMovies.stream().sorted(Comparator.comparing(movies1 -> movies1.getYear())).forEach(System.out::println);
        }else if(number==2){
            Stream<Movies>list=jsonMovies.parallelStream();
            list.collect(Collectors.toList()).forEach(System.out::println);
        }else {
            System.out.println("Сураныч башка танданыз");
        }
    }

    @Override
    public void sortByName(List<Movies> movies) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Алфабиттин башынан < 1 > ");
        System.out.println("Алфабиттин аягынан < 2 > ");
        int number =scanner.nextInt();
        if(number==1){
            jsonMovies.stream().sorted(Comparator.comparing(movies1 -> movies1.getName())).forEach(System.out::println);
        }
     else if(number==2){
            Stream<Movies>list=jsonMovies.parallelStream();
            list.collect(Collectors.toList()).forEach(System.out::println);
        }else {
            System.out.println();
        }
    }

    @Override
    public void sortByDirector(List<Movies> movies) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Алфабиттин башынан < 1 > ");
        System.out.println("Алфабиттин аягынан < 2 > ");
        int number=scanner.nextInt();
        if(number==1) {
            jsonMovies.stream().sorted(Comparator.comparing(movies1 ->
                    movies1.getDirector().getFullName())).forEach(System.out::println);
        }else if(number==2){
            Stream<Movies>list=jsonMovies.parallelStream();
            list.collect(Collectors.toList()).forEach(System.out::println);
        }

    }
}