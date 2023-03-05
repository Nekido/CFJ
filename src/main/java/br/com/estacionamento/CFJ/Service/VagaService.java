package br.com.estacionamento.CFJ.Service;


import br.com.estacionamento.CFJ.Repository.VagaRepository;
import br.com.estacionamento.CFJ.Vagas.Vaga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VagaService {

    @Autowired
    private VagaRepository vagaRepository;

    public Vaga adicionarVaga(Vaga vaga) {
        return vagaRepository.save(vaga);
    }

    public Vaga atualizarVaga(Long id, Vaga vaga) {
        vaga.setId(id);
        return vagaRepository.save(vaga);
    }

    public void removerVaga(Long id) {
        vagaRepository.deleteById(id);
    }

    public Vaga buscarVaga(Long id) {
        return vagaRepository.findById(id).orElse(null);
    }
}