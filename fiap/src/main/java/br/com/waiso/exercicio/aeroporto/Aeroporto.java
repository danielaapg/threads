package br.com.waiso.exercicio.aeroporto;

public class Aeroporto extends Thread {

	private String nome;
	private boolean disponivel = true;

	public Aeroporto(String nome) {
		this.nome = nome;
	}

	public synchronized void aguardarPistaDisponivel() {
		try {
			while (!disponivel) {
				System.out.println(nome + ": Pista ocupada... Aguardar....");
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private synchronized void alterarEstadoPista() {
		disponivel = !disponivel;
		System.out.println(nome + " Disponibilidade da Pista:" + disponível);
		notifyAll();
	}

	public void run() {
		try {
			while (true) {
				alterarEstadoPista();
				sleep(3000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
