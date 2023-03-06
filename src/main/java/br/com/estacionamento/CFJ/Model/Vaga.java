package br.com.estacionamento.CFJ.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "vagas")
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private final Integer CAPACIDADETOTAL = 200;

    private Integer vagasCriadas = 0;

    private Integer capacidadeAtual;

    @Column(nullable = false)
    private Boolean ocupada;

    public Vaga() {
    }

    public Vaga(Boolean ocupada) {
        this.ocupada = ocupada;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getOcupada() {
        return ocupada;
    }

    public void setOcupada(Boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Integer getCAPACIDADETOTAL() {
        return CAPACIDADETOTAL;
    }

    public Integer getVagasCriadas() {
        return vagasCriadas;
    }

    public void setVagasCriadas(Integer vagasCriadas) {
        this.vagasCriadas = vagasCriadas;
    }

    public Integer getCapacidadeAtual() {
        return capacidadeAtual;
    }

    public void setCapacidadeAtual(Integer capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }



}