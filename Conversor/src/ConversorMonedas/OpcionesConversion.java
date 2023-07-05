package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije la moneda que deseas convertir tu dinero ",  "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De Pesos colombianos a Dólar", "De Pesos colombianos a Euro", "De Pesos colombianos a Libras Esterlinas", "De Pesos colombianos a Yen Japonés", "De Pesos colombianos a Won sub-coreano", "De Dólar a Pesos colombianos", "De Euro a Pesos colombianos", "De Libras Esterlinas a Pesos colombianos", "De Yen Japonés a Pesos colombianos", "De Won sub-coreano a Pesos colombianos"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "De Pesos colombianos a Dólar": 
		monedas.ConvertirPesoscolombianosDolares(valor);
		break;
	
	case "De Pesos colombianos a Euro": 
		monedas.ConvertirPesoscolombianosEuros(valor);
		break;
		
	case "De Pesos colombianos a Libras Esterlinas":
		monedas.ConvertirPesoscolombianosLibra(valor);
		break;
		
	case "De Pesos colombianos a Yen Japonés":
		monedas.ConvertirPesoscolombianosYen(valor);
		break;
		
	case "De Pesos colombianos a Won sub-coreano":
		monedas.ConvertirPesoscolombianosWon(valor);
		break;
	
	case "De Dólar a Pesos colombianos":
		monedas.ConvertirDolaresPesoscolombianos(valor);
		break;
		
	case "De Euro a Pesos colombianos":
		monedas.ConvertirEurosPesoscolombianos(valor);
		break;
		
	case "De Libras Esterlinas a Pesos colombianos":
		monedas.ConvertirLibraPesoscolombianos(valor);
		break;
	 
	case "De Yen Japonés a Pesos colombianos":
		monedas.ConvertirYenPesoscolombianos(valor);
		break;
		
	case "De Won sub-coreano a Pesos colombianos":
		monedas.ConvertirWonPesoscolombianos(valor);
		break;
	  }
    }

}
