package br.com.estacionamento.CFJ.Controller;

import br.com.estacionamento.CFJ.Model.Transacao;
import br.com.estacionamento.CFJ.Service.TransacaoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    private final TransacaoService transacaoService;

    public TransacaoController(TransacaoService transacaoService) {
        this.transacaoService = transacaoService;
    }

    @GetMapping
    public List<Transacao> listar() {
        return transacaoService.listarTransacoes();
    }

    @GetMapping("/{id}")
    public Transacao buscarTransacao(@PathVariable Long id) {
        return transacaoService.buscarTransacao(id);
    }

    @PostMapping
    public Transacao adicionarTransacao(@RequestBody Transacao transacao) {
        return transacaoService.criarTransacao(transacao);
    }

    @PutMapping("/{id}")
    public Transacao atualizarTransacao(@PathVariable Long id, @RequestBody Transacao transacao) {
        return transacaoService.atualizarTransacao(id, transacao);
    }

    @DeleteMapping("/{id}")
    public void excluirTransacao(@PathVariable Long id) {
        transacaoService.excluirTransacao(id);
    }

}
