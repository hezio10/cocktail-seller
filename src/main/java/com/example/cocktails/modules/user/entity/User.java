package com.example.cocktails.modules.user.entity;

import com.example.cocktails.modules.event.entity.Event;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(length = 255)
    private String companyName;

    @OneToMany(mappedBy = "user")
    private List<Event> events = new ArrayList<>();
}
