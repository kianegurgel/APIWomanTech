package br.com.Woman.tech.WomanTech.Controller;
import br.com.Woman.tech.WomanTech.Model.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.Woman.tech.WomanTech.Service.usuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/login")
public class loginController {

    @Autowired
    private usuarioService usuarioService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String cpf, @RequestParam String senha) {
        Optional<usuario> usuario = usuarioService.autenticar(cpf, senha);

        if (usuario.isPresent()) {
            return ResponseEntity.ok("Login bem-sucedido");
        } else {
            return ResponseEntity.status(401).body("CPF ou senha inválidos");
        }
    }
}
