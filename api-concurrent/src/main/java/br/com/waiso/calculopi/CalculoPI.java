package br.com.waiso.calculopi;

import java.util.concurrent.Callable;

public class CalculoPI implements Callable<Double> {

    private int inicio;
    private int fim;

    public CalculoPI(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public Double call() throws Exception {
        double valor = 0.0;

        for (int i=inicio; i <= fim; i++) {
            valor += Math.pow(-1.0, i + 1) / (2.0 * (double)i - 1.0);
        }

        return valor;
    }
}
