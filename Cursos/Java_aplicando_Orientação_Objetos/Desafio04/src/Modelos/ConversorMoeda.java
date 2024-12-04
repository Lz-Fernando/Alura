package Modelos;
import Interfaces.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {
    private double dolar;
    private double real;


    @Override
    public double converterDolarParaReal(double dolar) {
        return real = dolar * 6.10;
    }
}
