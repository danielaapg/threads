package br.com.waiso.thread;

public class ThreadExemplo extends Thread {

	public void run() {
		int i = 0;
		while (i < 80) {
			i++;
			System.out.println("Contando " + i + "...");
		}
	}

}
