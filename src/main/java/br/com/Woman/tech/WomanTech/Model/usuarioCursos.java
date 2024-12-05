package br.com.Woman.tech.WomanTech.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class usuarioCursos {


    private  String nomeCurso;

    public int getId_Curso() {
        return id_Curso;
    }

    public void setId_Curso(int id_Curso) {
        this.id_Curso = id_Curso;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ou GenerationType.AUTO
    private int id_Curso;

    public Number getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(Number cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    private Number cpfUsuario;


}
