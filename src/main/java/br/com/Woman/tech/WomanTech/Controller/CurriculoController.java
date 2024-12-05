package br.com.Woman.tech.WomanTech.Controller;


import br.com.Woman.tech.WomanTech.Model.Curriculo;
import br.com.Woman.tech.WomanTech.Service.CurriculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/curriculo")
public class CurriculoController {

    @Autowired
    private CurriculoRepository CurriculoRepository;

    // Endpoint para salvar um novo currículo
    @PostMapping("/salvar")
    public ResponseEntity<Curriculo> salvarCurriculo(@RequestBody Curriculo curriculo) {
        Curriculo curriculoSalvo = CurriculoRepository.save(curriculo);
        return ResponseEntity.ok(curriculoSalvo);
    }
    @GetMapping("/cpf/{cpf}")
    public Curriculo getCurriculoByCpf(@PathVariable String cpf) {
        return CurriculoRepository.findByCpf(cpf)
                .orElseThrow(() -> new RuntimeException("Currículo não encontrado"));
    }

}
