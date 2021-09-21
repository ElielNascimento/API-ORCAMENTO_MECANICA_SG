package Exercicio3.exer3.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    @Autowired
    public ServicoRepository servicoRepository;

    public List<Servico> buscarTodosServicos() {
        return servicoRepository.findAll();
    }

    public Servico buscarServicoPeloId(Long id) {
        return servicoRepository.findById(id).orElseThrow(()
                -> new RuntimeException());
    }

    public Servico adicionarServico(Servico servico) {
        return servicoRepository.save(servico);
    }

    public void deletarServicoPeloId(Long id) {
        servicoRepository.findById(id);
    }

    public Servico atualizarServico(Servico servico) {
        servico.setTipoDeServico(servico.getTipoDeServico());
        return servicoRepository.save(servico);
    }
}
