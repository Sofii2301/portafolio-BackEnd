package com.portfolioweb.argprog.Repository;

import com.portfolioweb.argprog.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {

}
