package br.com.Woman.tech.WomanTech.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class tutora {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // ou GenerationType.AUTO
    private int idTutora;
    private String nomeTutora;
    private int cpf;
    private String senha;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdTutora() {
        return idTutora;
    }

    public void setIdTutora(int idTutora) {
        this.idTutora = idTutora;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNomeTutora() {
        return nomeTutora;
    }

    public void setNomeTutora(String nomeTutora) {
        this.nomeTutora = nomeTutora;
    }




}
