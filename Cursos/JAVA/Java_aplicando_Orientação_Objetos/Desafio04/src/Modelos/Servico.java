package Modelos;

import Interfaces.Vendavel;

public class Servico implements Vendavel {
    private double precoHora;
    private String descricao;

    @Override
    public double precoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoHora -= precoHora * (percentualDesconto / 100);
    }
}
