package org.senai.m2s06.veiculos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.senai.m2s06.veiculos.model.enums.TipoVeiculo;

import java.util.List;

@Entity
@Table(name = "veiculos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Veiculo {
    @Id
    private String placa;
    @Enumerated(EnumType.STRING)
    private TipoVeiculo tipoVeiculo;
    private String nome;
    private Integer anoFabricacao;
    private String cor;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "veiculo")
    private List<Multa> multas;

    public Veiculo(String placa, TipoVeiculo tipoVeiculo, String nome, Integer anoFabricacao, String cor) {
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", tipoVeiculo=" + tipoVeiculo +
                ", nome='" + nome + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", cor='" + cor + '\'' +
                ", multas=" + multas +
                '}';
    }
}