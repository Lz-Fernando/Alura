package Modelos;

import Interfaces.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private double altura;
    private double largura;
    private double area;
    private double perimetro;


    @Override
    public double calcularArea(double altura, double largura) {
        return area = altura * largura;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        return perimetro = altura + largura;
    }
}
