package Exercicio3.exer3.orcamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrcamentoRepository  extends JpaRepository <Orcamento,Long> {
}
