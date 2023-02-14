package conversordeMonedas;
import javax.swing.*;

public class ConvertirMonedas {
	public void ConvertirPesosColombianosaDolar(double valorRecibir) {
		double monedaDolar=valorRecibir/4773.75;
		monedaDolar=(double)Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $ "+ monedaDolar + " Dolares");
	}
	public void ConvertirPesosColombianosaEuro(double valorRecibir) {
		double monedaEuro=valorRecibir/5126.29;
		monedaEuro=(double)Math.round(monedaEuro*100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $ "+ monedaEuro + " Euros");
	}
}
