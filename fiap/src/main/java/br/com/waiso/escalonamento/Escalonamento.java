package br.com.waiso.escalonamento;

public class Escalonamento {

	public static void main(String[] args) {
		
		Escritor escritor1 = new Escritor("Escritor 1", 4);
		Escritor escritor2 = new Escritor("Escritor 2", 6);
		Escritor escritor3 = new Escritor("Escritor 3", 5);

		escritor1.start();
		escritor2.start();
		escritor3.start();
	}
}
