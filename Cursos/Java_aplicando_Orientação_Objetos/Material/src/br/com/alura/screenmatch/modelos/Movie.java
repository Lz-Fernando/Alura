package br.com.alura.screenmatch.modelos;

public class Movie {
    public String nome;
    public int anoLancamento;
    public boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    public int duracaoMinutos;

    public void exibeFichaTecnica () {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração em minutos: " + duracaoMinutos);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
    }

    public void avalia (double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia () {
        return somaDasAvaliacoes / totalAvaliacoes;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }
}
