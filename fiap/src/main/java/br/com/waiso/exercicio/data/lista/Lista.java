package br.com.waiso.exercicio.data.lista;

import java.util.ArrayList;

public class Lista extends Thread {

	public void run() {
		try {
			ArrayList<String> listaMensagens=new ArrayList<String>(); 
			listaMensagens.add("Favor verificar os sitemas de suporte."); 
			listaMensagens.add("Leituras efetuadas com sucesso."); 
			listaMensagens.add("Não há alarmes ativos."); 
			listaMensagens.add("Mensagem reservada");
			
			for (int i=0; i<listaMensagens.size(); i++) { 
				Thread.sleep(20*1000);
				System.out.println(listaMensagens.get(i)); 
			}
		} catch(Exception e) {
			e.printStackTrace(); 
		}
	}
	
}
