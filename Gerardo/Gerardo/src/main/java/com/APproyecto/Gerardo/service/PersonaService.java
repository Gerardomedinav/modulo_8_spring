
package com.APproyecto.Gerardo.service;

import com.APproyecto.Gerardo.model.Persona;
import com.APproyecto.Gerardo.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    public PersonaRepository persoRepo;
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }
    @Override
    public void borrarPersona(long id) {
       persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(long id) {
       return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

      
    }
