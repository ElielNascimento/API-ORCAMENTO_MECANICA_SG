package Exercicio3.exer3.orcamento;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orcamento")
public class OrcamentoController {

    @Autowired
    private OrcamentoService orcamentoService;

    @GetMapping("/buscar")
    private List<Orcamento> buscarOrcamentos() {
        return orcamentoService.buscarOrcamentos();
    }

    @GetMapping("/{id}")
    private Orcamento buscarOrcamentoPeloId(@PathVariable Long id) {
        return orcamentoService.buscarOrcamentoPeloId(id);
    }

    @PostMapping("/adicionar")
    private Orcamento adicionarOrcamento(@RequestBody Orcamento orcamento) {
        return orcamentoService.adicionarOrcamento(orcamento);
    }

    @DeleteMapping("{id}")
    private void deletarOrcamentoPeloId(@PathVariable Long id) {
        orcamentoService.deletarOrcamentoPeloId(id);
    }

    @PutMapping("/atualizar")
    private Orcamento atualizarOrcamento(@RequestBody Orcamento orcamento) {
        return orcamentoService.atualizarOrcamento(orcamento);
    }
}
