package Exercicio3.exer3.cliente;

import Exercicio3.exer3.veiculo.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> buscarListaDeClientes() {
        return clienteRepository.findAll();
    }

    public Cliente buscarClientePeloId(Long id) {
        return clienteRepository.findById(id).orElseThrow(()
                -> new RuntimeException("Usuario nao encontrado"));
    }

    public Cliente adicionarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void DeletarPeloId(Long id) {
        clienteRepository.deleteById(id);
    }

    public Cliente atualizarCliente(Cliente cliente) {
        cliente.setNome(cliente.getNome());
        return clienteRepository.save(cliente);
    }


}
