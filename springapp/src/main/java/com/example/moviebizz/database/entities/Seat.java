package com.example.moviebizz.database.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Seat {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id")
    private String id;
    @Column(name = "row_id")
    private int rowId;
    @Column(name = "row_number")
    private int rowNumber;
    @ManyToOne
    private Screen screenId;

    public Seat() {
    }

    public Seat(String id, int rowId, int rowNumber, Screen screenId) {
        this.id = id;
        this.rowId = rowId;
        this.rowNumber = rowNumber;
        this.screenId = screenId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public Screen getScreenId() {
        return screenId;
    }

    public void setScreenId(Screen screenId) {
        this.screenId = screenId;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id='" + id + '\'' +
                ", rowId=" + rowId +
                ", rowNumber=" + rowNumber +
                ", screenId=" + screenId +
                '}';
    }
}
