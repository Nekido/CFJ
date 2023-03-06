package br.com.estacionamento.CFJ.Controller;

import br.com.estacionamento.CFJ.Service.VagaService;
import br.com.estacionamento.CFJ.Model.Vaga;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vagas")
public class VagaController {

    private final VagaService vagaService;

    public VagaController(VagaService vagaService) {
        this.vagaService = vagaService;
    }

    @PostMapping
    public Vaga adicionarVaga(@RequestBody Vaga vaga) {
        return vagaService.adicionarVaga(vaga);
    }

    @PatchMapping("/atualizar/{id}")
    public Vaga atualizarVaga(@PathVariable Long id, @RequestBody Vaga vaga) {
        return vagaService.atualizarVaga(id, vaga);
    }

    @GetMapping("")
    public List<Vaga> buscarVagas() {
        return vagaService.buscarVagas();
    }

    @GetMapping("/{id}")
    public Vaga buscarVagaPorId(@PathVariable Long id) {
        return vagaService.buscarVagaPorId(id);
    }

    @DeleteMapping("/{id}")
    public void removerVaga(@PathVariable Long id) {
        vagaService.removerVaga(id);
    }

}