package br.com.Woman.tech.WomanTech.Controller;

import br.com.Woman.tech.WomanTech.Model.usuario;
import br.com.Woman.tech.WomanTech.Model.usuarioCursos;
import br.com.Woman.tech.WomanTech.Service.usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //  nunca colocar ';' em anotation
@RequestMapping("/api/usuario") // SEMPRE anotation ficar colado com o metodo da classe
@CrossOrigin("*")
public class usuarioController {

    @Autowired //@ = annotation
    private usuarioService usuarioService;   // importando a classe do service

    @PostMapping // metodo do tipo post
    public ResponseEntity<usuario> criarUsuario(@RequestBody usuario usuario) {
        usuario novoUsuario = usuarioService.criarUsuario(usuario);
        return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
        //return "Usuario Criado";
    }

}
