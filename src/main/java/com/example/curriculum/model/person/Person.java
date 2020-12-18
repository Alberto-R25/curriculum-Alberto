package com.example.curriculum.model.person;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.ArrayList;

@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String firstName;
    private String lastName;
    private String job;
    private String city;
    private String country;
    private String email;
    private String phoneNumber;
    private ArrayList<Skills> skills;
    private ArrayList<Languages> languages;
    private ArrayList<WorkExperience> workexperience;
    private ArrayList<Education> education;
    private ArrayList<Challenges> challenges;
    private ArrayList<SocialMedia> socialMedia;
    private ArrayList<Config> config;
}
