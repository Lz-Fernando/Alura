package Desafio_Final;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double  limite;
    private double saldo;
    private double List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean efetuarCompra (Compra compra) {
        if (this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        } else {
            return false;
        }
    }
}
