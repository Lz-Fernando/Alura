package Desafio_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(4);
        numeros.add(3);
        numeros.add(5);
        numeros.add(2);

        Collections.sort(numeros);

        System.out.println("Lista ordenada: " + numeros);

        //-------------------------------------------------------

        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo("B"));
        listaTitulos.add(new Titulo("C"));
        listaTitulos.add(new Titulo("A"));

        Collections.sort(listaTitulos);

        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.nome);
        }

        //-------------------------------------------------------

        List<String> array = new ArrayList<>();
        array.add("1");
        array.add("2");

        List<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");

        System.out.println(array);
        System.out.println(linked);


        //-------------------------------------------------------

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
