package com.transport.internshiptest.model;

import javax.persistence.*;

@Table
@Entity(name="BUS_STOP")
public class BusStop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String latitude;
    private String longitude;

    public BusStop() {
    }

    public BusStop(String name, String latitude, String longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }
}


