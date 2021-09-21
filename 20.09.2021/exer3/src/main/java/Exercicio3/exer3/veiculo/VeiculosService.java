package Exercicio3.exer3.veiculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VeiculosService {


    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> buscarVeiculos() {
        return veiculoRepository.findAll();
    }

    public Veiculo buscarVeiculosPelodId(Long id) {
        return veiculoRepository.findById(id).orElseThrow(()
                -> new RuntimeException("veiculo nao encontrado"));
    }

    public Veiculo adicionarVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public void deletarVeiculo(Long id) {
        veiculoRepository.deleteById(id);
    }

    public Veiculo atualizarVeiculo(Veiculo veiculo) {
        veiculo.setMarca(veiculo.getMarca());
        veiculo.setModelo(veiculo.getModelo());
        return veiculoRepository.save(veiculo);
    }

}
