package br.com.estacionamento.CFJ.Service;

import br.com.estacionamento.CFJ.Model.Cliente;
import br.com.estacionamento.CFJ.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Cliente buscarClientePorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente criarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void atualizarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public void excluirCliente(Cliente cliente) {
        clienteRepository.delete(cliente);
    }
}
