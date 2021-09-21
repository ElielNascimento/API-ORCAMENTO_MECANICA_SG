package Exercicio3.exer3.avaliacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoService {

    @Autowired
    public AvaliacaoRepository avaliacaoRepository;

    public List<Avaliacao> buscarAvaliacoes() {
        return avaliacaoRepository.findAll();
    }

    public Avaliacao buscarAvaliacaoPeloId(Long id) {
        return avaliacaoRepository.findById(id).orElseThrow(()
                -> new RuntimeException());
    }

    public Avaliacao adicionarAvaliacao(Avaliacao avaliacao) {
        return avaliacaoRepository.save(avaliacao);
    }

    public void deletarAvaliacaoPeloId(Long id) {
        avaliacaoRepository.findById(id);
    }

    public Avaliacao atualizarAvaliacao(Avaliacao avaliacao) {
        avaliacao.setAvaliarFreios(avaliacao.getAvaliarFreios());
        avaliacao.setAvaliarMotor(avaliacao.getAvaliarMotor());
        avaliacao.setAvaliarSuspensao(avaliacao.getAvaliarSuspensao());
        return avaliacaoRepository.save(avaliacao);

    }
}
