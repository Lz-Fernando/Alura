package Desafio_02;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.Strictness;

public class Main {
    public static void main(String[] args){
        //1º
//        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";
//        Gson gson = new Gson();
//        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
//        System.out.println(pessoa);

        //2º
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";
        Gson gson = new GsonBuilder().setStrictness(Strictness.LENIENT).create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
        System.out.println(pessoa);

        //3º
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gson2 = new Gson();
        Livro livro = gson2.fromJson(jsonLivro, Livro.class);
        System.out.println(livro);
    }
}
