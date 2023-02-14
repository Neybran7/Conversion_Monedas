package conversordeMonedas;

import javax.swing.JOptionPane;

public class Function {
 ConvertirMonedas monedas= new ConvertirMonedas();
	public void ConvertirMonedas(double valorRecibir) {
		
		String opciones=(JOptionPane.showInputDialog(null, "Escoja la  moneda que desea convertir tu dinero ", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]
				{"De pesos a Dolar","De Pesos a Euro", "De Pesos a Libras", "De pesos a peso mexicano" , "De pesos a yen" },"Selecion")).toString();
		switch (opciones) {
		case "De pesos a Dolar": {
			
			monedas.ConvertirPesosColombianosaDolar(valorRecibir);
			break;
		}
		case "De Pesos a Euro":{
			monedas.ConvertirPesosColombianosaEuro(valorRecibir);
		}
	}
}
}