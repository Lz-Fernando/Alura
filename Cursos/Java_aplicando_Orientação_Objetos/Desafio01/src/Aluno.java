public class Aluno {
    String nome;
    int idade;

    void exibirInformacoesPessoais () {
        System.out.printf("""
                Nome do aluno: %s
                Idade: %d
                """, nome, idade);
    }
}
