package Exercicio3.exer3.funcionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping("/buscar")
    private List<Funcionario> buscarFuncionarios() {
        return funcionarioService.buscarFuncionarios();
    }

    @GetMapping("{id}")
    private Funcionario buscarFuncionarioPeloId(@PathVariable Long id) {
        return funcionarioService.buscarFuncionarioPeloId(id);
    }

    @PostMapping("/adicionar")
    private Funcionario adicionarFuncionar(@RequestBody Funcionario funcionario) {
        return funcionarioService.adicionarFuncionario(funcionario);
    }

    @DeleteMapping("/{id}")
    private void deletarFuncionarioPeloId(@PathVariable Long id) {
        funcionarioService.deletarFuncionarioPeloId(id);
    }

    @PutMapping("/atualizar")
    private Funcionario atualizarFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioService.atualizarFuncionario(funcionario);
    }
}
