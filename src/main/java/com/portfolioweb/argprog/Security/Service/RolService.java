package com.portfolioweb.argprog.Security.Service;

import com.portfolioweb.argprog.Security.Entity.Rol;
import com.portfolioweb.argprog.Security.Enums.RolNombre;
import com.portfolioweb.argprog.Security.Repository.iRolRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return  irolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
