package com.transport.internshiptest.model;

import javax.persistence.*;

@Entity
@Table(name="BUS")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="license_plate")
    private String licensePlate;
    @OneToOne
    @JoinColumn(name = "servingLine_id", referencedColumnName = "id")
    private BusLine servingLine;


    public Bus() {
    }

    public Bus(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setServingLine(BusLine servingLine) {
        this.servingLine = servingLine;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public BusLine getServingLine() {
        return servingLine;
    }
}
