package br.com.waiso.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumidor implements Runnable {

	private BlockingQueue<Integer> queue;

	public Consumidor(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			while (true) {
				/*
				 * se houver valor retira ele da fila, senão fica bloqueado até
				 * que um valor seja adicionado
				 */
				int valor = queue.take();

				System.out.println(valor);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
