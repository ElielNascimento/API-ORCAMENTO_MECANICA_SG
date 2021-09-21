package Exercicio3.exer3.servico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long> {

}
