package Desafio_02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto produto01 = new Produto("Carne", 9.99, 10);
        Produto produto02 = new Produto("Coxinha", 5.50, 5);
        Produto produto03 = new Produto("Panetone", 15.0, 1);
        ProdutoPerecivel perecivel01 = new ProdutoPerecivel("Tomate", 1.00, 1, 5);

        listaDeProdutos.add(produto01);
        listaDeProdutos.add(produto02);
        listaDeProdutos.add(produto03);

        System.out.println(listaDeProdutos.size());
        System.out.println(listaDeProdutos.get(2));
        System.out.println(perecivel01);

        for (Produto produto : listaDeProdutos)  {
            System.out.println(produto);
        }
    }
}
