package com.pae.pmup.model;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "users") // evita conflito com palavra reservada
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, unique=true, length=80)
    private String username;

    @Column(name="full_name", length=120)
    private String fullName;

    @Column(unique=true, length=150)
    private String email;

    @Column(name="created_at")
    private Instant createdAt = Instant.now();

    public User() {}

    public User(String username, String fullName, String email) {
        this.username = username;
        this.fullName = fullName;
        this.email = email;
    }

    // getters e setters
    public Long getId() { return id; }
    public String getUsername() { return username; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public Instant getCreatedAt() { return createdAt; }

    public void setId(Long id) { this.id = id; }
    public void setUsername(String username) { this.username = username; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setEmail(String email) { this.email = email; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
}
