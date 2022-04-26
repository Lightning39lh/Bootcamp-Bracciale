
package com.bootcamp6.controllers;

import com.bootcamp6.model.Minion;
import com.bootcamp6.services.MinionService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Minion")
public class MinionController {
    @Autowired
    MinionService minionService;
    
     @GetMapping("/all")
    public ArrayList<Minion> getAllMinions(){
        return minionService.getAllMinions();
    }
    @PostMapping("")
    public Minion saveMinion(@RequestBody Minion minion){
        return minionService.saveMinion(minion);
    }
     @DeleteMapping("/{id}")
    public String removeMinion(@PathVariable("id") Long id){
        if (minionService.removeMinion(id)){
            return "Se elimino el heroe de id " +id+" correctamente";
        } else {
            return "el heroe no existe o no pudo ser eliminada";
            }
    }
}
