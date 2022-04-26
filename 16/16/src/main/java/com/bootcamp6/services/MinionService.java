
package com.bootcamp6.services;

import com.bootcamp6.model.Minion;
import com.bootcamp6.repositories.MinionRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MinionService {
    
    @Autowired
    MinionRepository minionRepository;

    public ArrayList<Minion> getAllMinions() {
        return (ArrayList<Minion>) minionRepository.findAll();
    }

    public Minion saveMinion(Minion minion) {
        return minionRepository.save(minion);
    }

    public boolean removeMinion(Long id) {
        try {
            minionRepository.deleteById(id);
            return true;
            
        } catch (Exception e) {
            return false;
        }
    }

  
    
}
