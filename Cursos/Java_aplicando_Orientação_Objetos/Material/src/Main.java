public class Main {
    public static void main(String[] args) {
        Movie meuFilme = new Movie();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoLancamento = 1978;
        meuFilme.duracaoMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
    }
}