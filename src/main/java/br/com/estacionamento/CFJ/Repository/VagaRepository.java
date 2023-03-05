package br.com.estacionamento.CFJ.Repository;

import br.com.estacionamento.CFJ.Model.Vaga;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VagaRepository extends CrudRepository<Vaga, Long> {

}
