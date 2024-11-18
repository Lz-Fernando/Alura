public class Main {
    public static void main(String[] args) {
        Movie meuFilme = new Movie();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoLancamento = 1978;
        meuFilme.duracaoMinutos = 180;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoLancamento);
    }
}