
package com.APproyecto.Gerardo.repository;

import com.APproyecto.Gerardo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    
}
