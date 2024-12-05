package br.com.Woman.tech.WomanTech.Service;
import br.com.Woman.tech.WomanTech.Model.tutora;
import br.com.Woman.tech.WomanTech.Model.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tutoraService {

    @Autowired
    private tutoraRespository tutoraRespository;

    public tutora criarTutora(tutora tutora) {
        return tutoraRespository.save(tutora);

    }
}