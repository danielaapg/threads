package br.com.waiso.calculopi;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //cria um pool de threads para realizar o cálculo
        ExecutorService es = Executors.newCachedThreadPool();

        //separa o cálculo em 4 partes definindo o valor de n inicial e final para cada uma
        Future<Double> parte1 =  es.submit(new CalculoPI(1,100000000));
        Future<Double> parte2 = es.submit(new CalculoPI(100000001,200000000));
        Future<Double> parte3 = es.submit(new CalculoPI(200000001,300000000));
        Future<Double> parte4 = es.submit(new CalculoPI(400000001,500000000));

        //junta os valores cálculados das 4 partes e multiplica por 4
        double pi = 4.0 * (parte1.get() + parte2.get() + parte3.get() + parte4.get());

        System.out.println("Valor calculado de PI é " + pi);
    }
}
