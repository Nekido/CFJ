package br.com.estacionamento.CFJ.Service;

import br.com.estacionamento.CFJ.Model.Transacao;
import br.com.estacionamento.CFJ.Repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransacaoService {
    @Autowired
    private TransacaoRepository transacaoRepository;

    public List<Transacao> listarTransacoes() {
        return transacaoRepository.findAll();
    }

    public Transacao buscarTransacao(Long id) {
        return transacaoRepository.findById(id).orElse(null);
    }

    public Transacao criarTransacao(Transacao transacao) {
        return transacaoRepository.save(transacao);
    }

    public Transacao atualizarTransacao(Long id, Transacao transacao) {
        transacao.setId(id);
        return transacaoRepository.save(transacao);
    }

    public void excluirTransacao(Long id) {
        transacaoRepository.deleteById(id);
    }
}
