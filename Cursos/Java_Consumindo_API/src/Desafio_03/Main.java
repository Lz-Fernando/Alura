package Desafio_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1º
        var numero1 = 0;
        var numero2 = 0;

        System.out.println("Digite o 1º número: ");
        numero1 = scan.nextInt();
        System.out.println("Digite o 2º número: ");
        numero2 = scan.nextInt();

        try {
            var divisao = numero1 / numero2;

            System.out.println("Resultado da divisão: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        //2º
        System.out.println("Digite sua senha: ");
        String senha = scan.nextLine();

        try {
            validarSenha(senha);
            System.out.println("Senha cadastrada!");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void validarSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres.");
        }
    }
}
