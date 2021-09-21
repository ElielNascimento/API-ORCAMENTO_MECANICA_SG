package Exercicio3.exer3.orcamento;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrcamentoService {

    @Autowired
    public OrcamentoRepository orcamentoRepository;

    public List<Orcamento> buscarOrcamentos() {
        return orcamentoRepository.findAll();
    }

    public Orcamento buscarOrcamentoPeloId(Long id) {
        return orcamentoRepository.findById(id).orElseThrow(
                () -> new RuntimeException("usuario nao encontrado"));
    }

    public Orcamento adicionarOrcamento(Orcamento orcamento) {
        return orcamentoRepository.save(orcamento);
    }

    public void deletarOrcamentoPeloId(Long id) {
        orcamentoRepository.findById(id);
    }

    public Orcamento atualizarOrcamento(Orcamento orcamento) {
        orcamento.setAprovar(orcamento.getAprovar());
        orcamento.setDiasDeTrabalho(orcamento.getDiasDeTrabalho());
        orcamento.setValor(orcamento.getValor());
        return orcamentoRepository.save(orcamento);
    }
}
