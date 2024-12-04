package Modelos;

import Interfaces.Vendavel;

public class Produto implements Vendavel {
    private double preco;
    private int quantidade;
    private int desconto;
    private double precoFinal;


    @Override
    public double precoTotal() {
        if (quantidade > 10) {
            return precoFinal = preco * ((double) (desconto + 5) / 100);
        } else {
            return precoFinal = preco * ((double) desconto / 100);
        }
    }
}
