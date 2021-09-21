package Exercicio3.exer3.cliente;

import Exercicio3.exer3.veiculo.Veiculo;
import Exercicio3.exer3.veiculo.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private VeiculosService veiculosService;

    @GetMapping("/buscar")
    private List<Cliente> buscarTodosClientes() {
        return clienteService.buscarListaDeClientes();
    }

    @GetMapping("/{id}")
    public Cliente buscarClientePeloId(@PathVariable Long id) {
        return clienteService.buscarClientePeloId(id);
    }

    @PostMapping("/adicionar")
    public Cliente adicionarCliente(@RequestBody Cliente cliente) {
        return clienteService.adicionarCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public void deletarCliente(@PathVariable Long id) {
        clienteService.DeletarPeloId(id);
    }

    @PutMapping("/atualizar")
    public Cliente atualizarCliente(@RequestBody Cliente cliente) {



        return clienteService.atualizarCliente(cliente);
    }
}
