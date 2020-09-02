import javax.swing.JOptionPane;

public class MatrizDe2Dimesoes {

	public static void main(String[] args) {
		//Criaremos o vetor referente aos dias do m�s com apenas 1 semana, para 
		//simplificar.
		Double faturamentoTotal = 0.0;
		Double faturamentoDiario = 0.0;
		Double [] faturamentoJaneiro = new Double[6];
		Double [] faturamentoFevereiro = new Double[6];
		Double [] faturamentoMarco = new Double[6];
		Integer meses = 0;
	
		meses = Integer.parseInt(JOptionPane.showInputDialog("Escolha "
				+ "o m�s para adicionar o faturamento: \n" + 
				"1 - Janeiro \n" + "2 - Fevereiro \n" + "3 - Mar�o"));
		switch (meses) {
		case 1:
			for (int i = 1; i <= faturamentoJaneiro.length; i++) {
				faturamentoJaneiro [i] = Double.parseDouble(JOptionPane.showInputDialog(
						"Entre com o faturamento do " + i + "� dia do m�s: "));
				faturamentoDiario += faturamentoJaneiro [i];
				faturamentoTotal += faturamentoDiario;
			}
			System.out.println("Faturamento do m�s de janeiro: " + faturamentoTotal);
			break;
		case 2: 
			for (int i = 1; i <= faturamentoFevereiro.length; i++) {
				faturamentoFevereiro [i] = Double.parseDouble(JOptionPane.showInputDialog(
						"Entre com o faturamento do " + i + "� dia do m�s: "));
				faturamentoDiario += faturamentoFevereiro [i];
				faturamentoTotal += faturamentoDiario;
			}
			System.out.println("Faturamento do m�s de fevereiro: " + faturamentoTotal);
			break;
		case 3: 
			for (int i = 1; i <= faturamentoMarco.length; i++) {
				faturamentoFevereiro [i] = Double.parseDouble(JOptionPane.showInputDialog(
						"Entre com o faturamento do " + i + "� dia do m�s: "));
				faturamentoDiario += faturamentoFevereiro [i];
				faturamentoTotal += faturamentoDiario;
			}
			System.out.println("Faturamento do m�s de mar�o: " + faturamentoTotal);
			break;

		default:
			JOptionPane.showMessageDialog(null, "M�s inv�lido!");
			break;
		}
		
		Double [] [] faturamentoDoPrimeiroTrimestre = new Double [] [] {
			faturamentoJaneiro,
			faturamentoFevereiro,
			faturamentoMarco};
	}

}
