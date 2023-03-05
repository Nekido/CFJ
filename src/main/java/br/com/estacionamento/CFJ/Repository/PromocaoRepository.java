package br.com.estacionamento.CFJ.Repository;


import br.com.estacionamento.CFJ.Marketing.Promocao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromocaoRepository extends JpaRepository<Promocao, Long> {
}
