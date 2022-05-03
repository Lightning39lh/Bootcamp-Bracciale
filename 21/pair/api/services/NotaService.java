/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.portfoliobracciale.api.services;

import ar.com.portfoliobracciale.api.models.Nota;
import ar.com.portfoliobracciale.api.repositories.NotaRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotaService {
    
    @Autowired
    NotaRepository notaRepository;
    
     public ArrayList<Nota> getAllNotas() {
        return (ArrayList<Nota>) notaRepository.findAll();
    }

    public Nota save(Nota proyect) {
        return notaRepository.save(proyect);
    }

    public Nota getProyectByID(Long id) {
        return notaRepository.findById(id).get();
    }

    public boolean deleteById(Long id) {
        try {
            notaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public double findAvgPorPersona(Long id){
          return notaRepository.findAvgPorPersona(id);
    }
    public ArrayList<Nota> findAllAprobedNotes(){
        return (ArrayList<Nota>) notaRepository.findAllAprobedNotes();
    }
    
}
   /* public List<Nota> getNotasByPersonId(Long personId) {
           return personRepository.findAllByPersonId(personId);
    }*/
    
