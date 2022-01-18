package com.company;

import java.util.List;

public interface FindAble {

    void findMoviesByActor(List<Movies> movies,String actor);

    void findMoviesByDirector(List<Movies> movies,String director);

    void findMoviesByYear(List<Movies> movies, int name);

    void findMoviesAndRoleByActor(List<Movies> movies);

    void showActorRoles(List<Movies> movies);
}
