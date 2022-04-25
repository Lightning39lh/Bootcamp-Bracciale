/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Persona.services;


import com.example.Persona.models.Person;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Persona.repositories.PersonRepository;


@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;
    
    
    public ArrayList<Person> getAllPersons(){
        return (ArrayList<Person>) personRepository.findAll();
    }

    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    public Optional<Person> getPersonByID(Long id) {
        return personRepository.findById(id);
    }

    public ArrayList<Person> getPersonByApellido(String apellido) {
        return personRepository.findByApellido(apellido);
    }
    public boolean removePerson(Long id) {
        try {
             personRepository.deleteById(id);
             return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}