package br.com.waiso.sincronizacao;

public class Buffer {
	
	private int conteudo;
	private boolean disponivel = false;

	public synchronized int get() {
		try {
			while (!disponivel) {
				wait();
			}
			System.out.println("Consumidor - Valor [" + conteudo + "] consumido.");
			disponivel = false;
			notifyAll();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conteudo;
	}

	public synchronized void put(int valor) {
		try {
			while (disponivel) {
				wait();
			}
			System.out.println("Produtor - Valor [" + valor + "] produzido.");
			conteudo = valor;
			disponivel = true;
			notifyAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
