package Desafio_03;

import Desafio_03.Modelos.Animal;
import Desafio_03.Modelos.Cachorro;
import Desafio_03.Modelos.Produto;

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



        //6°
    }
}
