public class Desafio {
    public static void main(String[] args) throws Exception {
        double nota01 = 9.0;
        double nota02 = 6.0;
        double media = (nota01 + nota02) / 2;

        System.out.println(media);

        //******************************

        double variavel01 = (int) 5.8;
        int variavel02 = 4;

        System.out.println(variavel01 + ", " + variavel02);

        //******************************

        char letra = 'c';
        String palavra = "palavra";

        System.out.println(letra + palavra);

        //******************************

        double precoProduto = 7.0;
        int quantidade = 20;

        double valorTotal = precoProduto * quantidade;

        System.out.println(valorTotal);

        //******************************

        double valorEmDolares = 2.8;

        double valorEmReal = valorEmDolares * 4.94;

        System.out.println(String.format("%.2f", valorEmReal));

        //******************************

        double precoOriginal = 10.0;
        double percentualDesconto = 20;

        double desconto = (precoOriginal * percentualDesconto) / 100;

        System.out.println(desconto);
    }
}
