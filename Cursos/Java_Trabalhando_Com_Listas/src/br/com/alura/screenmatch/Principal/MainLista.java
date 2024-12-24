package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class MainLista {
    public static void main(String[] args) {
        Serie lost = new Serie("Lost", 2000);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDeFe = new Filme("Dogville", 2003);
        filmeDeFe.avalia(10);
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDeFe);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo  item : lista) {
            System.out.println(item.getNome());
            Filme filme =  (Filme) item;
            System.out.println("Classificação" + filme.getClassificacao());
        }
    }
}
