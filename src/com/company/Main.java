package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Movies> movies = JsonIO.getMovies();
    private static final List<Cast>cast=new ArrayList<>();
    private static SortAble s = (SortAble) new MovieStore();
    private static FindAble f = (FindAble) new FindByMap();
    private static Scanner in = new Scanner(System.in);
private static Scanner h=new Scanner(System.in);
    public static void main(String[] args) throws InputException {
        while (true) {
            commads();
            int print=in.nextInt();
            if(print<=0||print>10){
                throw new InputException("Мындай тандоо жок");
            }
            switch (print){
                case 1:
                    s.printAllMovies(movies);
                    break;
                case 2:
                    System.out.println("Кинонун атын жазыныз");
                    String name=h.nextLine();
                    s.findMovie(movies,name);
                    break;
                case 3:
                    s.sortByYear(movies);
                    break;
                case 4:
                    s.sortByName(movies);
                    break;
                case 5:
                    s.sortByDirector(movies);
                    break;
                case 6:
                    System.out.println("актердун атын жазыныз");
                    String actorName=h.nextLine();

                    f.findMoviesByActor(movies,actorName);
                    break;
                case 7:
                    System.out.println("Деректордун атын жазыныз");
                 String directorName=h.nextLine();
                 f.findMoviesByDirector(movies,directorName);
                 break;
                case 8:
                    System.out.println("Кинонун жылын жазыныз");
                    int year =in.nextInt();
                    f.findMoviesByYear(movies,year);
                    break;
                case 9:
                  f.findMoviesAndRoleByActor(movies);
                    break;
                case 10:
                    f.showActorRoles(movies);

                    break;
                default:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~");
            }

        }
    }


    static void commads() {
        System.out.println();
        System.out.println("--------------Commands-----------------------");
        System.out.println("Press 1 to print catalog");
        System.out.println("Press 2 to Find a Movie by full or part name");
        System.out.println("Press 3 to sort by year");
        System.out.println("Press 4 to sort by name");
        System.out.println("Press 5 to sort by director");
        System.out.println("Press 6 to find movies by actor's name");
        System.out.println("Press 7 to find movies by director's name");
        System.out.println("Press 8 to find movies by year");
        System.out.println("Press 9 to List all movies and roles by actor's name");
        System.out.println("Press 10 to sorted List of all actors with his roles");
        System.out.println("---------------------------------------------");
        System.out.println();

    }

//    static int getInt() {
//        System.out.print("Write year ");
//        int a = 0;
//        try {
//            String b = in.next();
//            a = Integer.parseInt(b);
//        } catch (Exception e) {
//            System.out.println("Wrong again, try again");
//            e.printStackTrace();
//        }
//        return a;
 //   }
}
