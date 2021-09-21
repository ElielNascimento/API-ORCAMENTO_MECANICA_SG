package Exercicio3.exer3.veiculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculosService veiculosService;

    @GetMapping("/buscar")
    private List<Veiculo> buscarTodosVeiculos() {
        return veiculosService.buscarVeiculos();
    }

    @GetMapping("/{id}")
    private Veiculo buscarVeiculoPeloId(@PathVariable Long id) {
        return veiculosService.buscarVeiculosPelodId(id);
    }

    @PostMapping("/adicionar")
    private Veiculo adicionarVeiculos(@RequestBody Veiculo veiculo) {
        return veiculosService.adicionarVeiculo(veiculo);
    }

    @DeleteMapping("{id}")
    private void deletarVeiculo(@PathVariable  Long id) {
        veiculosService.deletarVeiculo(id);
    }

    @PutMapping("/atualizar")
    private Veiculo atualizarVeiculo( @RequestBody Veiculo veiculo) {
        return veiculosService.atualizarVeiculo(veiculo);
    }


}
