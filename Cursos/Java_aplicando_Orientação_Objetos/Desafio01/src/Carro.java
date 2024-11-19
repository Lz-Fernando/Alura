public class Carro {
    String modelo;
    int ano;
    String cor;
    int idade;

    void exibirFichaTecnica () {
        System.out.printf("""
                Modelo do carro: %s
                Ano: %d
                Idade: %d
                Cor: %s
                """, modelo, ano, idade, cor);
    }

    int calcularIdadeCarro (int anoAtual) {
        return idade = anoAtual - ano;
    }
}
