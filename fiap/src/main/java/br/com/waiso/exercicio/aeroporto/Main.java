package br.com.waiso.exercicio.aeroporto;

public class Main {

	public static void main(String[] args) {
		
		Aeroporto aeroporto = new Aeroporto("Guarulhos");
		Aviao aviao1 = new Aviao("TAM", aeroporto);
		Aviao aviao2 = new Aviao("GOL", aeroporto);
		Aviao aviao3 = new Aviao("AZUL", aeroporto);
		
		aeroporto.start();
		aviao1.start();
		aviao2.start();
		aviao3.start();
		
	}
}
