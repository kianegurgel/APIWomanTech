package br.com.Woman.tech.WomanTech.Service;
import br.com.Woman.tech.WomanTech.Model.tutora;
import br.com.Woman.tech.WomanTech.Model.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface tutoraRespository extends JpaRepository<tutora, Long> {
}
