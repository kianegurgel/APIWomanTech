package br.com.Woman.tech.WomanTech.Controller;
import br.com.Woman.tech.WomanTech.Model.tutora;
import br.com.Woman.tech.WomanTech.Model.usuario;
import br.com.Woman.tech.WomanTech.Model.vagasEmprego;
import br.com.Woman.tech.WomanTech.Service.candidatarVagasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //  nunca colocar ';' em anotation
@RequestMapping("/api/cadidatarVaga") // SEMPRE anotation ficar colado com o metodo da classe
public class candidatarVagasController {

    @Autowired //@ = annotation
    private candidatarVagasService candidatarVagasService;

    @PostMapping // metodo do tipo post
    public String candidatarVagas (@RequestBody vagasEmprego vagasEmprego ) { // RequestBody é onde ele requer um parametro (variavel, lista, matriz ou entidade 'model')
        vagasEmprego novaVaga  = candidatarVagasService.candidatar(vagasEmprego);
        //return new ResponseEntity<>(vagasEmprego, HttpStatus.CREATED);
        return "Candidatura enviada com sucesso";
    }

}
