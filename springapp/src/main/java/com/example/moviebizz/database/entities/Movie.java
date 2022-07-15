package com.example.moviebizz.database.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id")
    private String id;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "movie_desc")
    private String movieDesc;

    public Movie() {
    }

    public Movie(String id, String movieName, String movieDesc) {
        this.id = id;
        this.movieName = movieName;
        this.movieDesc = movieDesc;
    }

    public Movie(String movieName, String movieDesc) {
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
        return "Movie{" +
                "id='" + id + '\'' +
                ", movieName='" + movieName + '\'' +
                ", movieDesc='" + movieDesc + '\'' +
                '}';
    }
}
