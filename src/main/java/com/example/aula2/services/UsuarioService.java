package com.example.aula2.services;

import com.example.aula2.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioService {



    /* injeção pelo atributo
    @Autowired
    private UsuarioRepository usuarioRepository;
*/

    /* Injeção pelo construtor
    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public void inserir(Object usuario){
        if(validar(usuario)){
            usuarioRepository.inserir(usuario);
        }
    }
    public boolean validar(Object usuario){
        return true;
    }
    */
}
