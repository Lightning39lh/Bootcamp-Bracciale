
package repositories;

import java.util.ArrayList;
import models.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person,Long>{

    public ArrayList<Person> findByApellido(String apellido);
}
