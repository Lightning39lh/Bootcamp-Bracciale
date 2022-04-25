/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example3.controllers;

import com.example3.model.Notebook;
import com.example3.services.NotebookService;
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
@RequestMapping("/api/Notebook")
public class NotebookController {
    
    @Autowired
    NotebookService notebookService;
    
    @GetMapping("/all")
    public ArrayList<Notebook> getAllNotebooks(){
        return notebookService.getAllNotebooks();
    }
    @PostMapping("")
    public Notebook savePerson(@RequestBody Notebook notebook){
        return notebookService.savePerson(notebook);
    }
     @DeleteMapping("/{id}")
    public String removeNotebook(@PathVariable("id") Long id){
        if (notebookService.removeNotebook(id)){
            return "Se elimino la notebook de id " +id+" correctamente";
        } else {
            return "La notebook no existe o no pudo ser eliminada";
            }
    }
}
