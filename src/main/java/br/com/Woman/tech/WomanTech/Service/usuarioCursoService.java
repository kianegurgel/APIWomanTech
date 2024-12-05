package br.com.Woman.tech.WomanTech.Service;

import br.com.Woman.tech.WomanTech.Model.usuarioCursos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class usuarioCursoService {

    @Autowired
    private usuarioCursoRepository usuarioCursoRepository;

    public usuarioCursos matricular(usuarioCursos usuarioCursos){
        return usuarioCursoRepository.save(usuarioCursos);

    }
}
