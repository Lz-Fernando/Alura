package Modelos;

import Interfaces.Vendavel;

public class Servico implements Vendavel {
    private double preco;
    private int desconto;
    private double precoFinal;


    @Override
    public double precoTotal() {
        return precoFinal = preco * (desconto) / 100;
    }
}
