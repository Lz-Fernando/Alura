package Modelos;

import Interfaces.Vendavel;

public class Produto implements Vendavel {
    private String nome;
    private double precoUnitario;

    @Override
    public double precoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoUnitario -= precoUnitario * (percentualDesconto / 100);
    }
}
