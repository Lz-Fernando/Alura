package Desafio_02;

import java.util.Date;

public class ProdutoPerecivel extends Produto {
    private int datavalidade;


    public ProdutoPerecivel(String nome, double preco, int quantidade, int datavalidade) {
        super(nome, preco, quantidade);
        this.datavalidade = datavalidade;
    }

    public int getDatavalidade() {
        return datavalidade;
    }

    public void setDatavalidade(int datavalidade) {
        this.datavalidade = datavalidade;
    }
}
