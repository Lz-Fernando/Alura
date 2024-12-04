package Modelos;

import Interfaces.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    private int numero;
    private int numeroMultiplicado;


    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 0; i <= 10; i++) {
            numeroMultiplicado = numero * i;
            System.out.printf("%d * %d = %d", numero, i, numeroMultiplicado);
        }
    }
}
