
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package Compiti;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Formula 1 DEDDE");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(320,240);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new StringBuilder();
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<html>");
		sb.append("<head></head>");
		sb.append("<body>");
		sb.append("<h1>Formula 1 DEDDE</h1>");
		sb.append("<table>");
		sb.append("<tr><th><h3>Pilota</h3></th>");
		sb.append("<th><h3>Punteggio</h3></th></tr>");
		sb.append("<tr><th>Pierluigi</th>");
		sb.append("<th>0</th></tr>");
		sb.append("<tr><th>Salvatore</th>");
		sb.append("<th>-200</th></tr>");
		sb.append("<tr><th>Carmine</th>");
		sb.append("<th>-400</th></tr>");
		sb.append("</body>");
		sb.append("</html>");
		
		

		// TODO Convertire lo StringBuilder in String
		String html= sb.toString();
		
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(html));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

