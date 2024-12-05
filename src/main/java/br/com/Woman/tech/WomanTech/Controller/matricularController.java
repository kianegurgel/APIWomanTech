package br.com.Woman.tech.WomanTech.Controller;

import br.com.Woman.tech.WomanTech.Model.usuario;
import br.com.Woman.tech.WomanTech.Model.usuarioCursos;
import br.com.Woman.tech.WomanTech.Service.usuarioCursoService;
import br.com.Woman.tech.WomanTech.Service.usuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //  nunca colocar ';' em anotation
@RequestMapping("/api/matricular")
public class matricularController {

    @Autowired
    private usuarioCursoService usuarioService;

    @PostMapping // metodo do tipo post
    public ResponseEntity<usuarioCursos> matricular(@RequestBody usuarioCursos usuarioCursos) {
        usuarioCursos novoMatricula = usuarioService.matricular(usuarioCursos);
        return new ResponseEntity<>(novoMatricula, HttpStatus.CREATED);
    }
}
