package com.example.curriculum.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Persondto {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String job;
    private String city;
    private String country;
    private String email;
    private String phoneNumber;


    public Persondto(String firstname, String lastname, String job, String city, String country, String email, String phoneNumber){
        this.firstname = firstname;
        this.lastname = lastname;
        this.job = job;
        this.city = city;
        this.country = country;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
