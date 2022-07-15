package com.example.moviebizz.database.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id")
    private String id;
    @ManyToOne
    private User userID;
    @ManyToOne
    private Movie movieID;
    @ManyToOne
    private Venue venueID;

    public Ticket() {
    }

    public Ticket(String id, User userID, Movie movieID, Venue venueID) {
        this.id = id;
        this.userID = userID;
        this.movieID = movieID;
        this.venueID = venueID;
    }

    public Ticket(User userID, Movie movieID, Venue venueID) {
        this.userID = userID;
        this.movieID = movieID;
        this.venueID = venueID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    public Movie getMovieID() {
        return movieID;
    }

    public void setMovieID(Movie movieID) {
        this.movieID = movieID;
    }

    public Venue getVenueID() {
        return venueID;
    }

    public void setVenueID(Venue venueID) {
        this.venueID = venueID;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", userID=" + userID +
                ", movieID=" + movieID +
                ", venueID=" + venueID +
                '}';
    }
}
