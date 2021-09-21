package Exercicio3.exer3.veiculo;

import Exercicio3.exer3.avaliacao.Avaliacao;
import Exercicio3.exer3.cliente.Cliente;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;


    @JoinColumn(name ="veiculo_id")
    @ManyToOne
    public Cliente cliente;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
