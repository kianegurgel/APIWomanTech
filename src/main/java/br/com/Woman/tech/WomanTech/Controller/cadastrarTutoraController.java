package br.com.Woman.tech.WomanTech.Controller;
import br.com.Woman.tech.WomanTech.Model.tutora;
import br.com.Woman.tech.WomanTech.Model.usuario;
import br.com.Woman.tech.WomanTech.Service.tutoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //  nunca colocar ';' em anotation
@RequestMapping("/api/cadastrarTutora") // SEMPRE anotation ficar colado com o metodo da classe

public class cadastrarTutoraController {
    @Autowired //@ = annotation
    private tutoraService tutoraService;

    @PostMapping // metodo do tipo post
    public String criarTutora (@RequestBody tutora tutora ) { // RequestBody é onde ele requer um parametro (variavel, lista, matriz ou entidade 'model')
        tutora novaTutora = tutoraService.criarTutora(tutora);
        //return new ResponseEntity<>(novoTutora, HttpStatus.CREATED);
        return "Tutora Criado";
    }

}
