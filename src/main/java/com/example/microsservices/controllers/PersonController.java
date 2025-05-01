package com.example.microsservices.controllers;

import com.example.microsservices.model.Person;
import com.example.microsservices.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonServices service;

    @GetMapping
    public List<Person> findById() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Person findById(@PathVariable(value = "id") String id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public Person create(@RequestBody Person person) {
        return service.create(person);
    }

    @PutMapping
    public Person update(@RequestBody Person person) {
        return service.create(person);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}