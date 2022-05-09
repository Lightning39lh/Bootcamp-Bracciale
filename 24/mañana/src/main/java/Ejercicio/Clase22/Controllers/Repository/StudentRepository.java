package Ejercicio.Clase22.Controllers.Repository;

import Ejercicio.Clase22.Models.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByDni(long dni);
    Student findById(long id);
    Page<Student> findAll(Pageable cantidad);
}
