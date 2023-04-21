package com.portfolioweb.argprog.Security.Service;

import com.portfolioweb.argprog.Security.Entity.Usuario;
import com.portfolioweb.argprog.Security.Repository.iUsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean existByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existByEmail(String email){
        return iusuarioRepository.existsByEmail(email);
    }

    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }
}
