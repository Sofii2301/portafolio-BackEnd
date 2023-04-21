package com.portfolioweb.argprog.Interface;

import com.portfolioweb.argprog.Entity.Persona;

import java.util.List;

public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();

    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);

    //Eliminar un objeto por id
    public void deletePersona(Long id);

    //Buscar una persona por id
    public Persona findPersona(Long id);
}
