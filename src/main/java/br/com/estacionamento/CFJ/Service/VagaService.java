package br.com.estacionamento.CFJ.Service;

import br.com.estacionamento.CFJ.Repository.VagaRepository;
import br.com.estacionamento.CFJ.Model.Vaga;
import org.springframework.stereotype.Service;

@Service
public class VagaService {

    private final VagaRepository vagaRepository;

    public VagaService(VagaRepository vagaRepository) {
        this.vagaRepository = vagaRepository;
    }

    public Vaga adicionarVaga(Vaga vaga) {
        long vagasCriadas = vagaRepository.count();

        if (vagasCriadas == 0) {
            vaga.setVagasCriadas(1);
            vaga.setCapacidadeAtual(199);
        } else if (vagasCriadas == 200) {
            throw new IllegalStateException("Todas as vagas já foram cadastradas!");
        } else {
            vaga.setVagasCriadas(Math.toIntExact(vagasCriadas += 1));
            vaga.setCapacidadeAtual(vaga.getCAPACIDADETOTAL() - vaga.getVagasCriadas());
        }

        return vagaRepository.save(vaga);
    }

    public Vaga atualizarVaga(Long id, Vaga vaga) {
        Vaga vagaAtualizada = vagaRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        vagaAtualizada.setOcupada(vaga.getOcupada());
        return vagaRepository.save(vagaAtualizada);
    }

    public void removerVaga(Long id) {
        vagaRepository.deleteById(id);
    }

    public Vaga buscarVaga(Long id) {
        return vagaRepository.findById(id).orElse(null);
    }
}