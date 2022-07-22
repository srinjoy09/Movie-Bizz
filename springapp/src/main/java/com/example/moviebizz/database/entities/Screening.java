package com.example.moviebizz.database.entities;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
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
}
