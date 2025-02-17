package Desafio_01;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoa = new ArrayList<>();

        var pessoa1 = new Pessoa("Fernando", 21);
        var pessoa2 = new Pessoa("Thayna", 22);
        var pessoa3 = new Pessoa("Renato", 51);

        listaDePessoa.add(pessoa1);
        listaDePessoa.add(pessoa2);
        listaDePessoa.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoa.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoa.getFirst());
        System.out.println(listaDePessoa);
    }
}
