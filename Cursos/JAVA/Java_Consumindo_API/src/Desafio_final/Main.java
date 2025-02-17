package Desafio_final;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ConsultaCep consultaCep = new ConsultaCep();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco("01001000");
            System.out.println(novoEndereco);
            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.salvarJson(novoEndereco);
        } catch (IOException | RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando.");
        }
    }
}
