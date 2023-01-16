
package com.APproyecto.Gerardo.service;

import com.APproyecto.Gerardo.model.Persona;
import java.util.List;


public interface IPersonaService {

 
    public List<Persona> verPersonas ();
    public void crearPersona (Persona per);
    public void borrarPersona (long id);
    public Persona buscarPersona (long id);    

    public void deleteById(long id);

    
}
