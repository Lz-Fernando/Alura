public class Movie {
    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacoes;
    int duracaoMinutos;

    void exibeFichaTecnica () {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia (double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia () {
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}
