package Modelos;

import Interfaces.Calculavel;

public class Livro implements Calculavel{
    double preco;
    double desconto;
    double precoFinal;


    @Override
    public double calcularPrecoFinal() {
        return precoFinal = preco * (desconto / 100);
    }
}
