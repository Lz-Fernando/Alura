import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "Fernando";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("\n************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("\n************************\n");


        while (true) {
            int selecaoMenu;

            System.out.println("1 - Visualizar saldo");
            System.out.println("2 - Registrar receita");
            System.out.println("3 - Registrar despesa");
            System.out.println("0 - Encerrar programa");

            System.out.println("\nDigite o número referente a qual ação deseja realizar: ");
            selecaoMenu = scanner.nextInt();

            if (selecaoMenu == 1) {
                System.out.println("\n************************");
                System.out.println("Saldo: " + saldo);
                System.out.println("************************\n");
            }

            else if (selecaoMenu == 2) {
                double receita;

                System.out.println("Digite o valor da receita gerada: R$");
                receita = scanner.nextDouble();
                saldo += receita;

                System.out.println("\n************************");
                System.out.println("O saldo foi atualizado para: R$" + saldo);
                System.out.println("************************\n");
            }

            else if (selecaoMenu == 3) {
                double despesa;

                System.out.println("Digite o valor da despesa: R$");
                despesa = scanner.nextDouble();
                saldo -= despesa;

                System.out.println("\n************************");
                System.out.println("O saldo foi atualizado para: R$" + saldo);
                System.out.println("************************\n");
            }

            else if (selecaoMenu == 0) {
                System.out.println("O sistema foi encerrado!");
                break;
            }
        }
    }
}