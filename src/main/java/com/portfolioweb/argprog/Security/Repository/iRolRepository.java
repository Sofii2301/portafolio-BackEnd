package com.portfolioweb.argprog.Security.Repository;

import com.portfolioweb.argprog.Security.Entity.Rol;
import com.portfolioweb.argprog.Security.Enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
