package com.molvenolakeresort.models.restaurant.temp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "RESTAURANT_USER")
public class User {

    private @Id @GeneratedValue
    Long id;
    private String name;
    private String phoneNumber;
    private String email;

    public User()
    {

    }
    public User(Long id, String name, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
