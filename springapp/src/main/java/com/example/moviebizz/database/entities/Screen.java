package com.example.moviebizz.database.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Screen {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id")
    private String id;
    @ManyToOne
    private Venue venueId;
    @Column(name = "seats_num")
    private int seatsNum;

    public Screen() {
    }

    public Screen(String id, Venue venueId, int seatsNum) {
        this.id = id;
        this.venueId = venueId;
        this.seatsNum = seatsNum;
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

    public int getSeatsNum() {
        return seatsNum;
    }

    public void setSeatsNum(int seatsNum) {
        this.seatsNum = seatsNum;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "id='" + id + '\'' +
                ", venueId=" + venueId +
                ", seatsNum=" + seatsNum +
                '}';
    }
}
