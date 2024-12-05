package br.com.Woman.tech.WomanTech.Service;
import br.com.Woman.tech.WomanTech.Model.vagasEmprego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface candidatarVagasRepository extends JpaRepository<vagasEmprego, Long>{
}
