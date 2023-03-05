package br.com.estacionamento.CFJ.Controller;

import br.com.estacionamento.CFJ.Service.VagaService;
import br.com.estacionamento.CFJ.Model.Vaga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vagas")
public class VagaController {

    @Autowired
    private VagaService vagaService;

    @PostMapping
    public Vaga adicionarVaga(@RequestBody Vaga vaga) {
        return vagaService.adicionarVaga(vaga);
    }

    @PutMapping("/{id}")
    public Vaga atualizarVaga(@PathVariable Long id, @RequestBody Vaga vaga) {
        return vagaService.atualizarVaga(id, vaga);
    }

    @DeleteMapping("/{id}")
    public void removerVaga(@PathVariable Long id) {
        vagaService.removerVaga(id);
    }

    @GetMapping("/{id}")
    public Vaga buscarVaga(@PathVariable Long id) {
        return vagaService.buscarVaga(id);
    }
}