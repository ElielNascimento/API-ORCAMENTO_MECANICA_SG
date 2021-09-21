package Exercicio3.exer3.funcionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    public FuncionarioRepository funcionarioRepository;

    public List<Funcionario> buscarFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public Funcionario buscarFuncionarioPeloId(Long id) {
        return funcionarioRepository.findById(id).orElseThrow(()
                -> new RuntimeException("usuario nao enocontrado"));
    }

    public Funcionario adicionarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public void deletarFuncionarioPeloId(Long id) {
        funcionarioRepository.deleteById(id);
    }

    public Funcionario atualizarFuncionario(Funcionario funcionario) {
        funcionario.setNome(funcionario.getNome());
        return funcionarioRepository.save(funcionario);
    }
}
