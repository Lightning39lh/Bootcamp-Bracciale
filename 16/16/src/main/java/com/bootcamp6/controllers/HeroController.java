/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bootcamp6.controllers;

import com.bootcamp6.model.Hero;
import com.bootcamp6.repositories.HeroRepository;
import com.bootcamp6.services.HeroService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/Hero")
public class HeroController {
    @Autowired
    HeroService heroService;
    @Autowired
    HeroRepository heroRepository;
    
    @GetMapping("/all")
    public ArrayList<Hero> getAllHeroes(){
        return heroService.getAllHeroes();
    }
    @PostMapping("")
    public Hero saveHero(@RequestBody Hero hero){
        return heroService.saveHeroes(hero);
    }
     @DeleteMapping("/{id}")
    public String removeHero(@PathVariable("id") Long id){
        if (heroService.removeHeroes(id)){
            return "Se elimino el heroe de id " +id+" correctamente";
        } else {
            return "el heroe no existe o no pudo ser eliminada";
            }
    }
   @PutMapping ("edit/{id}")
    public Hero editHHero (@PathVariable Long id,
                            @RequestParam ("name") String newName,
                            @RequestParam ("superPower") String newSuperPower){
        Hero hero = heroRepository.findById(id).orElse(null);
         hero.setName(newName);
         hero.setSuperPower(newSuperPower);
         return heroService.saveHeroes(hero);
      //return heroService.editHeros(String newName, String newSuperPower,Long id);
    }
}
