package br.com.Woman.tech.WomanTech.Service;

import br.com.Woman.tech.WomanTech.Model.usuario;
//import br.com.Woman.tech.WomanTech.Model.usuarioCursos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class usuarioService{

        @Autowired
        private usuarioRespository usuarioRespository;

        public usuario criarUsuario(usuario usuario) {
            return usuarioRespository.save(usuario);
        }

    public Optional<usuario> autenticar(String cpf, String senha) {
        Optional<usuario> usuario = usuarioRespository.findByCpf(cpf);
        if (usuario.isPresent() && usuario.get().getSenha().equals(senha)) { // isPresent = is not null
            return usuario; // Usuário encontrado e senha válida
        }
        return Optional.empty(); // Usuário não encontrado ou senha incorreta . empty = vazio
    }
    }
