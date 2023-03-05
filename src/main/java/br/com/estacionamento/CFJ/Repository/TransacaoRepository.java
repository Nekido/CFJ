package br.com.estacionamento.CFJ.Repository;

import br.com.estacionamento.CFJ.Model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long>{
}
