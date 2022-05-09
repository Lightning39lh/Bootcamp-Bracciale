package Ejercicio.Clase22.Controllers.Repository;

import Ejercicio.Clase22.Models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findById(long id);
    Page<User> findAll(Pageable cantidad);
}
