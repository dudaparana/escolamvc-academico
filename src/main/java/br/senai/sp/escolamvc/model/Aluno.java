package br.senai.sp.escolamvc.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.sql.Date;


@DiscriminatorValue(value = "A")
@Entity
public class Aluno extends Pessoa{

    @NotEmpty(message = "Campo obrigatorio!")

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


}
