package br.com.estacionamento.CFJ.Repository;

import br.com.estacionamento.CFJ.Model.Transacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends CrudRepository<Transacao, Long> {
}
