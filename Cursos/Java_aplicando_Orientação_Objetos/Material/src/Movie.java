public class Movie {
    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    int duracaoMinutos;

    void exibeFichaTecnica () {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração em minutos: " + duracaoMinutos);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
    }

    void avalia (double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia () {
        return somaDasAvaliacoes / totalAvaliacoes;
    }

    int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }
}
