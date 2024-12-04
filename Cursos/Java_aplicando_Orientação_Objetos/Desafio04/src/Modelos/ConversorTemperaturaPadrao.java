package Modelos;

import Interfaces.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    private double celsius;
    private double fahrenheit;

    @Override
    public void celsiusParaFahrenheit(double celsius) {
        fahrenheit = (celsius * 1.8) + 32;
        System.out.printf("%fº Celsius equivalem a %fº fahrenheit!", celsius, fahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        celsius = (fahrenheit - 32) / 1.8;
        System.out.printf("%fº Fahrenheit equivalem a %fº celsius!", fahrenheit, celsius);
    }
}
