package Exercicio3.exer3.avaliacao;

import javax.persistence.*;

@Entity
@Table(name = "avaliacao")
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "avaliarmotor")
    private String avaliarMotor;

    @Column(name = "avaliarfreios")
    private String avaliarFreios;

    @Column(name = "avaliarsuspensao")
    private String avaliarSuspensao;

    public Avaliacao() {
    }

    public String getAvaliarMotor() {
        return avaliarMotor;
    }

    public void setAvaliarMotor(String avaliarMotor) {
        this.avaliarMotor = avaliarMotor;
    }

    public String getAvaliarFreios() {
        return avaliarFreios;
    }

    public void setAvaliarFreios(String avaliarFreios) {
        this.avaliarFreios = avaliarFreios;
    }

    public String getAvaliarSuspensao() {
        return avaliarSuspensao;
    }

    public void setAvaliarSuspensao(String avaliarSuspensao) {
        this.avaliarSuspensao = avaliarSuspensao;
    }

    public Long getId() {
        return id;
    }
}
