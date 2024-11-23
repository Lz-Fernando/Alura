public class idadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade (int idade) {
        if (idade > 18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("Não é maior de idade");
        }
    }
}
