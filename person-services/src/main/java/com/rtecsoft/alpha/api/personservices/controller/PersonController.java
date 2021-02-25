package com.rtecsoft.alpha.api.personservices.controller;

import com.rtecsoft.alpha.api.personservices.model.Person;
import com.rtecsoft.alpha.api.personservices.service.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/all")
    public @ResponseBody Iterable<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Optional<Person> getPerson(@PathVariable("id") Integer id) {
        return personRepository.findById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<Person> addPerson(@RequestBody Person person) {
        Person newPerson = personRepository.save(person);
        return ResponseEntity.ok(newPerson);
    }
}
