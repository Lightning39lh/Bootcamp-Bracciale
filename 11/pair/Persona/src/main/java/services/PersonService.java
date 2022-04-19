
package services;

import java.util.ArrayList;
import java.util.Optional;
import models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.PersonRepository;


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
