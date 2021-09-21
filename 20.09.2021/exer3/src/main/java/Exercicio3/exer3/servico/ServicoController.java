package Exercicio3.exer3.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequestMapping("/servico")
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    @GetMapping("/buscar")
    private List<Servico> buscarTodosServicos() {
        return servicoService.buscarTodosServicos();
    }

    @GetMapping("{id}")
    private Servico buscarServicoPeloId(@PathVariable Long id) {
        return servicoService.buscarServicoPeloId(id);
    }

    @PostMapping("/adicionar")
    public Servico adicionarServico(@RequestBody Servico servico) {
        return servicoService.adicionarServico(servico);
    }

    @DeleteMapping("/{id}")
    public void deletarServicoPeloId(@PathVariable Long id) {
        servicoService.deletarServicoPeloId(id);
    }

    @PostMapping("/atualizar")
    private Servico atualizarServico(@RequestBody Servico servico) {
        return servicoService.atualizarServico(servico);
    }
}
