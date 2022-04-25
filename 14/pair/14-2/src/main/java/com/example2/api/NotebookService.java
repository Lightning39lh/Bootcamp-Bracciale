
package com.example2.api;

import com.example2.domain.Notebook;
import com.example2.repositories.NotebookRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotebookService {
	
    @Autowired
    NotebookRepository notebookRepository;

    public ArrayList<Notebook> getAllNotebooks() {
        return (ArrayList<Notebook>) notebookRepository.findAll();
    }

    public Notebook savePerson(Notebook notebook) {
        return notebookRepository.save(notebook);
    }

    public boolean removeNotebook(Long id) {
        try {
            notebookRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
