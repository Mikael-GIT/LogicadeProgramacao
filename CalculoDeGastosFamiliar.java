package Operadores;

import javax.swing.JOptionPane;

public class CalculoDeGastosFamiliar {

	public static void main(String[] args) {
		//Trabalhando com JOptionPane
		Double valorDoGastoTotal = 0.0;
		
		valorDoGastoTotal += Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da conta de luz: "));
		valorDoGastoTotal += Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da conta de água: "));
		valorDoGastoTotal += Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da conta de telefone: "));
		valorDoGastoTotal += Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da conta da mensalidade escolar: "));
		valorDoGastoTotal += Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da conta da fatura do cartão: "));
		valorDoGastoTotal += Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor dos gastos com supermercado: "));
		JOptionPane.showMessageDialog(null, "O valor do gasto mensal foi de: " + valorDoGastoTotal);
	}

}
