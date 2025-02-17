package desafio_01;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);

        //1º
//        System.out.println("Digite o nome do livro que deseja encontrar: ");
//        var busca = scan.nextLine();
//
//        String chave = "AIzaSyC6El8_bdDhUCg8Uiq28qe4EBciDkXX1VM";
//        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + busca;
//
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(endereco))
//                .build();
//        HttpResponse<String> response = client
//                .send(request, HttpResponse.BodyHandlers.ofString());
//
//        System.out.println(response.body());

        //2º
        System.out.println("Digite o nome da moeda que deseja encontrar: ");
        var busca = scan.nextLine();

        String chave = "AIzaSyC6El8_bdDhUCg8Uiq28qe4EBciDkXX1VM";
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + busca;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());


        //3º
    }
}
