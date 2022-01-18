package com.company;

import java.util.List;

public class Movies {

    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> cast;
  // private static final List<Movies>jsonIO=JsonIO.getMovies();
    void printCast() {
        int counter = 1;

        System.out.println();

        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Cast s : cast) {

            System.out.printf("%s)   Fullname: %s\n", counter, s.getFullName());
            System.out.println("     Role: " + s.getRole());
            counter++;


        }


    }
    int counter = 1;
    @Override
    public String toString() {

        return "\n"+

                "nameMovies   | " + name + '\n' +
                "yearMovies   | " + year + '\n' +
                "description  | " + description + '\n' +
                "directorName | " + director + '\n' +
                "actorName    \n" +  " "  + cast;


    }



//    void printMovies(){
//     int counter=1;
//        for (Movies m:jsonIO
//             ) {
//            System.out.printf("%s  name:  %s \n", counter, m.getName());
//            System.out.printf("%s  year:", m.getYear());
//            System.out.printf("%s  description: ", m.getDescription());
//            System.out.printf("%s  director: ", m.getDirector().getFullName());
//            System.out.printf("%s  cast:  ", m.getCast());
//
//            counter++;
//        }
//
//    }

    public List<Cast> getCast() {
        return cast;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public Director getDirector() {
        return director;
    }

}
