package com.gaalbudev.taskmanager.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="tarefas")
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(length = 200)
    private String description;

    private boolean completed;
}
