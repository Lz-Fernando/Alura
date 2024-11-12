import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 5;

        System.out.println("""
        Tente adivinhar o número entre 1 e 100!
        Você tem 5 tentativas!
        """);

        while (tentativas > 0) {
            System.out.println("Dê seu palpite: ");
            int chute = scanner.nextInt();

            if (chute == numeroAleatorio) {
                System.out.println("Parabéns, você acertou!");
                break;
            } else {
                tentativas--;
            }
        }

        if (tentativas == 0) {
            System.out.printf("o numero certo era %d", numeroAleatorio);
        }
    }
}