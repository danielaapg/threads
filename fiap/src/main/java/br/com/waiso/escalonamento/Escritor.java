package br.com.waiso.escalonamento;

public class Escritor extends Thread {
	
	private String nome;

	public Escritor(String nome, int prioridade) {
		this.nome = nome;
		this.setName(nome);
		this.setPriority(prioridade);
	}

	public void run() {
		int i = 0;

		while (i++ < 5) {
			System.out.println("(" + getName() + "/" + getId() + ")" + nome + " prioridade: " + this.getPriority());
			yield();
		}
	}
}
