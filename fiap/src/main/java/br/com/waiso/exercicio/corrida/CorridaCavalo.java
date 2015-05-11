package br.com.waiso.exercicio.corrida;

public class CorridaCavalo {

	public static void main(String[] args) {

		Cavalo cavalo1 = new Cavalo("Verdão");
		Cavalo cavalo2 = new Cavalo("Curintia");
		Cavalo cavalo3 = new Cavalo("Bambinos");
		Cavalo cavalo4 = new Cavalo("Marias");
		Cavalo cavalo5 = new Cavalo("Galo");
		Cavalo cavalo6 = new Cavalo("Urubus");
		Cavalo cavalo7 = new Cavalo("Vice da gama");

		Thread thread1 = new Thread(cavalo1);
		Thread thread2 = new Thread(cavalo2);
		Thread thread3 = new Thread(cavalo3);
		Thread thread4 = new Thread(cavalo4);
		Thread thread5 = new Thread(cavalo5);
		Thread thread6 = new Thread(cavalo6);
		Thread thread7 = new Thread(cavalo7);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();

	}
}
