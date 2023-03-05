package br.com.estacionamento.CFJ.Financeiro;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "transacoes")
public class Transacao {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private BigDecimal valor;

    @Column(nullable = false)
    private LocalDate data;


    public Transacao(BigDecimal valor, LocalDate data) {


        this.valor = valor;


        this.data = data;
    }


    public Long getId() {


        return id;
    }


    public void setId(Long id) {


        this.id = id;
    }


    public BigDecimal getValor() {
        return valor;
    }


    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }


    public LocalDate getData() {


        return data;
    }


    public void setData(LocalDate data) {


        this.data = data;
    }
}

