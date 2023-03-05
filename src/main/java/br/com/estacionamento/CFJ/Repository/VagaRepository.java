package br.com.estacionamento.CFJ.Repository;


import br.com.estacionamento.CFJ.Vagas.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VagaRepository extends JpaRepository<Vaga, Long> {

}
