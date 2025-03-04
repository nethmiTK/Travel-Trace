package com.project.TravelTrace.entity;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "content")
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contentId;

    private String textContent;
    private String filePath;
    private String contentType;

    @ManyToOne
    @JoinColumn(name = "trail_id", nullable = false)
    private Trail trail;

    @ManyToOne
    @JoinColumn(name = "created_person", nullable = false)
    private User createdPerson;
}
