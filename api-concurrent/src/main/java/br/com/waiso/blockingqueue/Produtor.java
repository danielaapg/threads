package br.com.waiso.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Produtor implements Runnable {

	private BlockingQueue<Integer> queue;

	public Produtor(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	public void run() {
		int i = 0;

		try {
			while (true) {
				/*
				 * adiciona valor na fila imediatamente se houver espaço, caso
				 * contrario aguarda até que o espaço fique disponível
				 */
				queue.put(i++);

				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
