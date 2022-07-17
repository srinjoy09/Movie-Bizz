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
    @Column(name = "seat_num")
    private int seatNum;
    @ManyToOne
    private User userID;
    @ManyToOne
    private Screening screeningId;

    public Ticket() {
    }

    public Ticket(String id, int seatNum, User userID, Screening screeningId) {
        this.id = id;
        this.seatNum = seatNum;
        this.userID = userID;
        this.screeningId = screeningId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    public Screening getScreeningId() {
        return screeningId;
    }

    public void setScreeningId(Screening screeningId) {
        this.screeningId = screeningId;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", seatNum=" + seatNum +
                ", userID=" + userID +
                ", screeningId=" + screeningId +
                '}';
    }
}
