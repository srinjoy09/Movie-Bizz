package com.example.moviebizz.database.entities;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Screening {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id")
    private String id;
    @ManyToOne
    private Venue venueId;
    @ManyToOne
    private Screen screenId;
    @ManyToOne
    private Movie movieId;
    @Column(name = "screeningDate")
    private java.sql.Date screeningDate;
    @Column(name = "screening_time")
    private java.sql.Time screeningTime;
    @Column(name = "booked_tickets")
    private int bookedTickets;

    public Screening() {
    }

    public Screening(String id, Venue venueId, Screen screenId, Movie movieId, Date screeningDate, Time screeningTime, int bookedTickets) {
        this.id = id;
        this.venueId = venueId;
        this.screenId = screenId;
        this.movieId = movieId;
        this.screeningDate = screeningDate;
        this.screeningTime = screeningTime;
        this.bookedTickets = bookedTickets;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Venue getVenueId() {
        return venueId;
    }

    public void setVenueId(Venue venueId) {
        this.venueId = venueId;
    }

    public Screen getScreenId() {
        return screenId;
    }

    public void setScreenId(Screen screenId) {
        this.screenId = screenId;
    }

    public Movie getMovieId() {
        return movieId;
    }

    public void setMovieId(Movie movieId) {
        this.movieId = movieId;
    }

    public Date getScreeningDate() {
        return screeningDate;
    }

    public void setScreenDate(Date screeningDate) {
        this.screeningDate = screeningDate;
    }

    public Time getScreeningTime() {
        return screeningTime;
    }

    public void setScreeningTime(Time screeningTime) {
        this.screeningTime = screeningTime;
    }

    public int getBookedTickets() {
        return bookedTickets;
    }

    public void setBookedTickets(int bookedTickets) {
        this.bookedTickets = bookedTickets;
    }

    @Override
    public String toString() {
        return "Screening{" +
                "id='" + id + '\'' +
                ", venueId=" + venueId +
                ", screenId=" + screenId +
                ", movieId=" + movieId +
                ", screenDate=" + screeningDate +
                ", screeningTime=" + screeningTime +
                ", bookedTickets=" + bookedTickets +
                '}';
    }
}
