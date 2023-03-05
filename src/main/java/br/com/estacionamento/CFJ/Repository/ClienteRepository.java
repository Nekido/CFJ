package br.com.estacionamento.CFJ.Repository;

import br.com.estacionamento.CFJ.Model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
