public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int avaliacaoParcial;
    double avaliacao;
    int numAvaliacoes;

    void fichaTecnica () {
        System.out.printf("""
                Título da música: %s
                Artísta: %s
                Ano de lançamento: %d
                Avaliação: %f
                """, titulo, artista, anoLancamento, avaliacao);
    }

    void avaliarMusica (int nota) {
        avaliacaoParcial += nota;
        numAvaliacoes++;
    }

    double gerarMediaDeAvaliacoes () {
        return avaliacao = avaliacaoParcial / numAvaliacoes;
    }
}
