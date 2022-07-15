package com.example.moviebizz.models;

import com.example.moviebizz.database.enums.Role;

public class VenueModel {
    private String id;
    private String location;

    public VenueModel(String id, String location) {
        this.id = id;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "VenueModel{" +
                "id='" + id + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
