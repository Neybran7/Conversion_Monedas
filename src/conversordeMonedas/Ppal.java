package conversordeMonedas;

import javax.swing.JOptionPane;

public class Ppal {
	
	
	public static void main(String[] args) {
		Function monedas =new Function();
		String opciones=(JOptionPane.showInputDialog(null, "Bienvenido a Conversion de Monedas ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda","Conversion de temperatura"},"Selecion")).toString();
		switch (opciones) {
		case "Conversor de Moneda": {
			String input=(JOptionPane.showInputDialog("Ingrese valor a convertir"));
		     
			double valorRecibir=Double.parseDouble(input);
			
			monedas.ConvertirMonedas(valorRecibir);
			int selecion=JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversion o salir?");
			if(JOptionPane.OK_OPTION==selecion) {
				System.out.println("Seleciona opcion afirmativa");
				
			}else {
				
				 JOptionPane.showMessageDialog(null, "Programa Termiando");
			}
		}
	
		
		}
	}

}
