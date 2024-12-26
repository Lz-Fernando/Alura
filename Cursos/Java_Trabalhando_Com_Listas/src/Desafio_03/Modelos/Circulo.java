package Desafio_03.Modelos;

import java.awt.geom.Area;

public class Circulo implements Formas{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea(double raio) {
        return 3.14 * (raio * raio);
    }
}
