package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ConvertirPesoscolombianosDolares(double valor) {
		double monedaDolar = valor / 4.154;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}
	public void ConvertirPesoscolombianosEuros(double valor) {
		double monedaEuro = valor / 4.545;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
	}
	public void ConvertirPesoscolombianosLibra(double valor) {
		double monedaLibra = valor / 5.291;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras Esterlinas");
	}
	public void ConvertirPesoscolombianosYen(double valor) {
		double monedaYen = valor / 0.03;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen Japonés");
	}
	public void ConvertirPesoscolombianosWon(double valor) {
		double monedaWon = valor / 0.3;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Won sub-coreano");
	}
	
	
	public void ConvertirDolaresPesoscolombianos(double valor) {
		double monedaDolar = 4.154 * valor;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Dolares " + monedaDolar + " en pesos (COP)");
	}
	public void ConvertirEurosPesoscolombianos(double valor) {
		double monedaEuro = valor * 4.545;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Euros " + monedaEuro + " en pesos (COP)");
	}
	public void ConvertirLibraPesoscolombianos(double valor) {
		double monedaLibra = valor * 5.291;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Libras Esterlinas " + monedaLibra + " en pesos (COP)");
	}
	public void ConvertirYenPesoscolombianos(double valor) {
		double monedaYen = valor * 0.03;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Yen Japonés " + monedaYen + " en pesos (COP)");
	}
	public void ConvertirWonPesoscolombianos(double valor) {
		double monedaWon = valor * 0.3;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Won sub-coreano " + monedaWon + " en pesos (COP)");
	}

}
