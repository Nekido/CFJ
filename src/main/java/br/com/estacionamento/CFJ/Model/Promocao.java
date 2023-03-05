package br.com.estacionamento.CFJ.Model;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;



@Entity
@Table(name = "promocoes")
public class Promocao {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private BigDecimal valorDesconto;

    @Column(nullable = false)
    private LocalDate dataInicio;

    @Column(nullable = false)
    private LocalDate dataFim;

    public Promocao(String nome, String descricao, BigDecimal valorDesconto, LocalDate dataInicio, LocalDate dataFim) {
        this.nome = nome;
        this.descricao = descricao;
        this.valorDesconto = valorDesconto;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

}
