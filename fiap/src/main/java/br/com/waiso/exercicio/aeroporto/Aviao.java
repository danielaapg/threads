package br.com.waiso.exercicio.aeroporto;


public class Aviao extends Thread {

	private String nome;
	private Aeroporto aeroporto;

	public Aviao(String nome, Aeroporto aeroporto) {
		this.nome = nome;
		this.aeroporto = aeroporto;
	}
	
	public void run() {
		try {
			decolar(); 
			voar(); 
			aterrissar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private synchronized void decolar() { 
		System.out.println(nome+" Iniciando Decolagem..."); 
		aeroporto.aguardarPistaDisponivel(); 
		System.out.println(nome+": Decolado.");
	}
	
	private synchronized void aterrissar() { 
		System.out.println(nome+" Iniciando Aterrisagem..."); 
		aeroporto.aguardarPistaDisponivel(); 
		System.out.println(nome+": Aterrissado");
	}
	
	private void voar() { 
		try {
			System.out.println(nome+" Voando...");
			sleep(4000); 
		} catch(Exception e){ 
			e.printStackTrace();
		} 
	}
}
