package br.com.waiso.exercicio.data.lista;

/**
 * Crie um sistema que inicie duas threads. Uma ficará enviando mensagens pré- configuradas de uma lista definida a cada 
 * 20 segundos. Quando todas as mensagens forem exibidas, a thread deverá se encerrar. A outra thread mostrará a cada 10 
 * a data e hora atual no formato “dia/mês/ano hora:minuto:segundo” (10/09/2012 14:00:33). Esta última thread funcionará 
 * em loop eterno. Após o início de ambas as threads, crie um loop eterno que apresente o estado de cada uma das threads 
 * a cada 5 segundos.
 *
 */
public class Controle {

	public static void main(String[] args) {

		try {
			Lista t1=new Lista();
			Data t2=new Data();
			
			t1.start(); 
			t2.start();
			while (true) { 
				Thread.sleep(5*1000);
				System.out.println("Estado Thread 1 "+t1.getState());
				System.out.println("Estado Thread 2 "+t2.getState()); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
