package Desafio_03.Modelos;

public class Quadrado implements Formas{
    private double metrica;

    public Quadrado(double metrica) {
        this.metrica = metrica;
    }

    public double getMetrica() {
        return metrica;
    }

    public void setMetrica(double metrica) {
        this.metrica = metrica;
    }

    @Override
    public double calcularArea() {
        return metrica * metrica;
    }
}
