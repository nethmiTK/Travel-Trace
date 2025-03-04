package com.project.TravelTrace.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "trail")
public class Trail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trailId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    @ManyToOne
    @JoinColumn(name = "created_person", nullable = false)
    private User createdPerson;
}
