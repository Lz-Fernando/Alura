public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica () {
        System.out.printf("""
                Título da música: %s
                Artísta: %s
                Ano de lançamento: %d
                """, titulo, artista, anoLancamento);
    }

    void avaliarMusica (double nota) {
        somaDasAvaliacao += nota;
        numAvaliacoes++;
    }

    double gerarMediaDeAvaliacoes () {
        return somaDasAvaliacao / numAvaliacoes;
    }
}
