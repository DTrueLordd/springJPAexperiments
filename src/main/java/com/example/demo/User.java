package com.example.demo;


import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //автоинкремент
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


    @Column(name="name")
    private String name;




    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
