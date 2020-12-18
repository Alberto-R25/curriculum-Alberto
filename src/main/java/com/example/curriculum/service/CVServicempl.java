package com.example.curriculum.service;

import com.example.curriculum.repository.CVRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.curriculum.model.person.Person;

@Service
public class CVServicempl implements CVService {

    @Autowired
    private CVRepository cvRepository;

    @Override
    public Person getById(String id) {
        Person person = new Person();
        person = cvRepository.getById(id);
        return person;
    }
}
