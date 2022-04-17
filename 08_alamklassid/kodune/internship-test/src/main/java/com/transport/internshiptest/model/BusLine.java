package com.transport.internshiptest.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="BUS_LINE")
public class BusLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @OneToOne(mappedBy = "servingLine")
    private Bus bus;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "BUS_LINE_ID")
    private List<BusStop> busStops = new ArrayList<>();

    public BusLine() {
    }

    public BusLine(String name, List<BusStop> busStops) {
        this.name = name;
        this.busStops = busStops;
    }

    public BusLine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Bus getBus() {
        return bus;
    }

    public List<BusStop> getBusStops() {
        return busStops;
    }
}
