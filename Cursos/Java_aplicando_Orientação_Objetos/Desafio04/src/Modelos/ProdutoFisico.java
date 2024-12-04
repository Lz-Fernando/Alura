package Modelos;

import Interfaces.Calculavel;

public class ProdutoFisico implements Calculavel {
    double preco;
    double desconto;
    double frete;
    double precoFinal;


    @Override
    public double calcularPrecoFinal() {
        return precoFinal = frete + preco * (desconto / 100);
    }
}
