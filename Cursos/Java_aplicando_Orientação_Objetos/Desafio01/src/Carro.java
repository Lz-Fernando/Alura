public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica () {
        System.out.printf("""
                Modelo do carro: %s
                Ano: %d
                Cor: %s
                """, modelo, ano, cor);
    }

    int calcularIdadeCarro () {
        return 2024 - ano;
    }
}
