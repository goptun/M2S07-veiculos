package org.senai.m2s06.veiculos;

import org.senai.m2s06.veiculos.model.Veiculo;
import org.senai.m2s06.veiculos.model.enums.TipoVeiculo;
import org.senai.m2s06.veiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Aplicacao {

    @Autowired
    private VeiculoRepository veiculoRepo;

    public void executar() {
        Veiculo veiculo1 = new Veiculo("AAA-1111", TipoVeiculo.AUTOMOVEL, "GT-R",2015 , "vermelho");
        Veiculo veiculo2 = new Veiculo("BBB-2222", TipoVeiculo.ONIBUS, "Marcopolo", 1998, "branco");
        veiculoRepo.save(veiculo1);
        veiculoRepo.save(veiculo2);
    }
}