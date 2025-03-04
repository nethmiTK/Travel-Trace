package com.project.TravelTrace.entity;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationId;

    private String name;
    private String type;

    @ManyToOne
    @JoinColumn(name = "parent_location_id")
    private Location parentLocation;
}
