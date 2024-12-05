package br.com.Woman.tech.WomanTech.Service;

import br.com.Woman.tech.WomanTech.Model.Curriculo;
import br.com.Woman.tech.WomanTech.Model.usuarioCursos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Repository
public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
    Optional<Curriculo> findByCpf(String cpf);
    // Aqui você pode adicionar métodos de consulta personalizados, se necessário
}
