package br.com.waiso.exercicio.data.lista;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Data extends Thread {

	public void run() {
		try {
			while (true) {
				Thread.sleep(10 * 1000);
				GregorianCalendar gCalendar = new GregorianCalendar();
				SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				System.out.println(formatador.format(gCalendar.getTime()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
