package br.com.Woman.tech.WomanTech.Service;
import br.com.Woman.tech.WomanTech.Model.vagasEmprego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class candidatarVagasService {

    @Autowired
    private candidatarVagasRepository candidatarVagasRepository;

    public vagasEmprego candidatar(vagasEmprego vagasEmprego){
        return candidatarVagasRepository.save(vagasEmprego);

    }
}
