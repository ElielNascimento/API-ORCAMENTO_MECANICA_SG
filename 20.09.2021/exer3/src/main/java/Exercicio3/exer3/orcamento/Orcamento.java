package Exercicio3.exer3.orcamento;

import Exercicio3.exer3.avaliacao.Avaliacao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orcamento")
public class Orcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "valor")
    private Integer valor;

    @Column(name = "diasdetrabalho")
    private Integer diasDeTrabalho;

    @Column(name = "aprovar")
    private Boolean aprovar;

    @OneToMany
    @JoinColumn(name = "orcamento_id")
    private List<Avaliacao> avaliacaoList;


    public Orcamento(Integer valor, Integer diasDeTrabalho, Boolean aprovar) {
        this.valor = valor;
        this.diasDeTrabalho = diasDeTrabalho;
        this.aprovar = aprovar;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Integer getDiasDeTrabalho() {
        return diasDeTrabalho;
    }

    public void setDiasDeTrabalho(Integer diasDeTrabalho) {
        this.diasDeTrabalho = diasDeTrabalho;
    }

    public Boolean getAprovar() {
        return aprovar;
    }

    public void setAprovar(Boolean aprovar) {
        this.aprovar = aprovar;
    }

    public Long getId() {
        return id;
    }
}
