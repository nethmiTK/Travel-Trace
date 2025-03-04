package com.project.TravelTrace.entity;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;

    private String roleName;
}
