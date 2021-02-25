package com.rtecsoft.alpha.api.personservices.service;


import com.rtecsoft.alpha.api.personservices.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
