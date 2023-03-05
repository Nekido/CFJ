package br.com.estacionamento.CFJ.Model;

import jakarta.persistence.*;


@Entity
@Table(name = "vagas")
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private final Integer CAPACIDADETOTAL = 200;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Boolean ocupada;

    public Vaga() {

    }

    public Vaga(String nome, Boolean ocupada) {
        this.nome = nome;
        this.ocupada = ocupada;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getOcupada() {
        return ocupada;
    }

    public void setOcupada(Boolean ocupada) {
        this.ocupada = ocupada;
    }
}