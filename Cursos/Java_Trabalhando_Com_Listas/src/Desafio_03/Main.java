package Desafio_03;

import Desafio_03.Modelos.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //1°
        ArrayList<Integer> numeros =  new ArrayList<Integer>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }


        //2°
        //Cachorro cachorro = new Cachorro();
        //Animal animal = (Animal) cachorro;


        //3°
        Animal animal = new Cachorro();

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
        } else {
            System.out.println("O objeto não é um cachorro");
        }


        //4°
        Produto produto01 = new Produto("café", 10.00);
        Produto produto02 = new Produto("nescau", 20.00);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto01);
        produtos.add(produto02);

        Double media = 0.0;
        for (Produto produto : produtos) {
            Double total = produto.getPreco();
            media = total / produtos.size();
        }

        System.out.println(media);

        //5°
        Circulo circulo1 = new Circulo(20);
        Circulo circulo2 = new Circulo(10);
        Circulo circulo3 = new Circulo(5);

        Quadrado quadrado1 = new Quadrado(20);
        Quadrado quadrado2 = new Quadrado(10);
        Quadrado quadrado3 = new Quadrado(5);

        ArrayList<Formas> listaFormas = new ArrayList<>();
        listaFormas.add(circulo1);
        listaFormas.add(circulo2);
        listaFormas.add(circulo3);
        listaFormas.add(quadrado1);
        listaFormas.add(quadrado2);
        listaFormas.add(quadrado3);

        for (Formas forma : listaFormas) {
            System.out.println("A área é: " + forma.calcularArea());
        }


        //6°
        ContaBancaria contaBancaria1 = new ContaBancaria(1, 100.0);
        ContaBancaria contaBancaria2 = new ContaBancaria(2, 10.0);
        ContaBancaria contaBancaria3 = new ContaBancaria(3, 2000.0);

        ArrayList<ContaBancaria> listaBancaria = new ArrayList<>();
        listaBancaria.add(contaBancaria1);
        listaBancaria.add(contaBancaria2);
        listaBancaria.add(contaBancaria3);

        double maiorValor = 0;
        int maiorConta = 0;
        for (ContaBancaria contaBancaria : listaBancaria) {
            if (contaBancaria.getSaldo() > maiorValor) {
                maiorValor = contaBancaria.getSaldo();
                maiorConta = contaBancaria.getNumeroConta();
            }
        }

        System.out.println("A conta com maior saldo é: " + maiorConta);
    }
}