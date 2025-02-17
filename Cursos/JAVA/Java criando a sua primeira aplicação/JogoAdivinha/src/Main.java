import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        int chute;

        System.out.println("""
        Tente adivinhar o número entre 1 e 100!
        Você tem 5 tentativas!
        """);

        while (tentativas < 5) {
            System.out.println("Dê seu palpite: ");
            chute = scanner.nextInt();

            if (chute == numeroAleatorio) {
                System.out.printf("Parabéns, você acertou em %d tentativas!", tentativas + 1);
                break;
            } else if (chute < numeroAleatorio){
                System.out.println("O número digitado é menor que o número certo!\n");
            } else {
                System.out.println("O número digitado é maior que o número certo!\n");
            }

            tentativas++;
        }

        if (tentativas == 5) {
            System.out.printf("o numero certo era %d", numeroAleatorio);
        }
    }
}