package br.com.Woman.tech.WomanTech.Service;

import br.com.Woman.tech.WomanTech.Model.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

//@Repository interface é um casca do service para comunicar com o banco de dados.
public interface usuarioRespository extends JpaRepository<usuario, Long> {
    Optional<usuario> findByCpf(String cpf);  // é opcional pode ou n ser usado. findBycpf é um metodo do java que procura algo por uma variavel
}