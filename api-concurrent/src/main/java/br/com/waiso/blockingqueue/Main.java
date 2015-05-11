package br.com.waiso.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

	public static void main(String[] args) {
		//cria fila bloqueante com 10 lugares disponíveis
		BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>(10);
		
		//cria e inicia thread para o produtor
		new Thread(new Produtor(queue)).start();
		
		//cria e inicia thread para o consumidor
		new Thread(new Consumidor(queue)).start();
	}

}
