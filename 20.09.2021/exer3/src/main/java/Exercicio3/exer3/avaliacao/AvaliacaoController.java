package Exercicio3.exer3.avaliacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacao")
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService avaliacaoService;

    @GetMapping("/buscar")
    private List<Avaliacao> buscarTodasAvaliacoes() {
        return avaliacaoService.buscarAvaliacoes();
    }

    @GetMapping("/{id}")
    private Avaliacao buscarAvaliacaoPeloId(@PathVariable Long id) {
        return avaliacaoService.buscarAvaliacaoPeloId(id);
    }

    @PostMapping("/adicionar")
    private Avaliacao adicionarAvaliacao(@RequestBody Avaliacao avaliacao) {
        return avaliacaoService.adicionarAvaliacao(avaliacao);
    }

    @DeleteMapping("/{id}")
    private void deletarAvaliacaoPeloId(Long id) {
        avaliacaoService.deletarAvaliacaoPeloId(id);
    }

    @PutMapping("/atualizar")
    private Avaliacao atualizarAvaliacao(Avaliacao avaliacao) {
        return avaliacaoService.adicionarAvaliacao(avaliacao);
    }
}
