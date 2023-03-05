package br.com.estacionamento.CFJ.Service;


import br.com.estacionamento.CFJ.Marketing.Promocao;
import br.com.estacionamento.CFJ.Repository.PromocaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromocaoService {


    private final PromocaoRepository promocaoRepository;


    @Autowired
    public PromocaoService(PromocaoRepository promocaoRepository) {


        this.promocaoRepository = promocaoRepository;
    }


    public List<Promocao> listarPromocoes() {


        return promocaoRepository.findAll();
    }


    public Promocao criarPromocao(Promocao promocao) {


        return promocaoRepository.save(promocao);
    }


    public Promocao atualizarPromocao(Promocao promocao) {


        return promocaoRepository.save(promocao);
    }


    public void deletarPromocao(Long id) {
        promocaoRepository.deleteById(id);
    }
}
