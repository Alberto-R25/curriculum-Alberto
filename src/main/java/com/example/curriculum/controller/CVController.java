package com.example.curriculum.controller;

import com.example.curriculum.model.person.Person;
import com.example.curriculum.service.CVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cv-api/person")

public class CVController {
    @Autowired
    private CVService cvService;

    @GetMapping(value = "/{id}", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public Person getPersonById(@PathVariable String id){
        return cvService.getById(id);
    }
}
