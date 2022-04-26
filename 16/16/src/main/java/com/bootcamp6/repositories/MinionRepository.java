
package com.bootcamp6.repositories;

import com.bootcamp6.model.Minion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MinionRepository extends JpaRepository<Minion,Long>{
    
    
}
