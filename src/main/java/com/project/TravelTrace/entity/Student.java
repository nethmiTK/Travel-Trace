package com.project.TravelTrace.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student") // Explicitly defining table name
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment primary key
    private Long id;

    @Column(nullable = false) // Name cannot be null
    private String name;

    @Column(nullable = false) // Age cannot be null
    private Integer age;
}
