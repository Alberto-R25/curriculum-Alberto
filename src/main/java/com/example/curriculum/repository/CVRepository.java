package com.example.curriculum.repository;

import com.example.curriculum.model.person.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVRepository extends MongoRepository<Person, String> {
    Person getById(String id);
}
