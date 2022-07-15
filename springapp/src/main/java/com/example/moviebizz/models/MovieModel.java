package com.example.moviebizz.models;

public class MovieModel {
    private String id;
    private String movieName;
    private String movieDesc;

    public MovieModel(String id, String movieName, String movieDesc) {
        this.id = id;
        this.movieName = movieName;
        this.movieDesc = movieDesc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDesc() {
        return movieDesc;
    }

    public void setMovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }

    @Override
    public String toString() {
        return "MovieModel{" +
                "id='" + id + '\'' +
                ", movieName='" + movieName + '\'' +
                ", movieDesc='" + movieDesc + '\'' +
                '}';
    }
}
