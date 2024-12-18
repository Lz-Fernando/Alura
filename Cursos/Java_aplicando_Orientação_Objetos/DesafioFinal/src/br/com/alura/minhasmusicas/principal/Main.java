package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.musica;
import br.com.alura.minhasmusicas.modelos.podcast;

public class Main {
    public static void main(String[] args) {
        musica minhaMusica = new musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        podcast meuPodcast = new podcast();
        meuPodcast.setTitulo("Bolha Dev");
        meuPodcast.setApresentador("Luiz Fernando");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }
    }

    MinhasPreferidas preferidas = new MinhasPreferidas();
    preferidas.inclui(meuPodcast);
    preferidas.inclui(minhaMusica);
}