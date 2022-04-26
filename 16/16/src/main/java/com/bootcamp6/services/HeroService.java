
package com.bootcamp6.services;

import com.bootcamp6.model.Hero;
import com.bootcamp6.repositories.HeroRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HeroService {
    @Autowired
    HeroRepository heroRepository;

    public ArrayList<Hero> getAllHeroes() {
        return (ArrayList<Hero>) heroRepository.findAll();
    }

   
    public Hero saveHeroes(Hero hero) {
        
        return heroRepository.save(hero);
    }
    
     public boolean removeHeroes(Long id) {
         try {
             heroRepository.deleteById(id);
             return true;
         } catch (Exception e) {
             return false;
         }     
    }
    public Hero editHero(String name, String superPower, Long id){
         Hero hero = heroRepository.findById(id).orElse(null);
         hero.setName(name);
         hero.setSuperPower(superPower);
         return hero;
     }

}
