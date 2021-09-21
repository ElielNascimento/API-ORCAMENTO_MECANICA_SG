package Exercicio3.exer3.servico;

import Exercicio3.exer3.funcionario.Funcionario;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "servico")
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoDeServico;

    public Servico() {
    }

    public Servico(String tipoDeServico) {
        this.tipoDeServico = tipoDeServico;
    }

    public String getTipoDeServico() {
        return tipoDeServico;
    }

    public void setTipoDeServico(String tipoDeServico) {
        this.tipoDeServico = tipoDeServico;
    }

    public Long getId() {
        return id;
    }
}
