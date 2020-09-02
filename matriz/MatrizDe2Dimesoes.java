import javax.swing.JOptionPane;

public class MatrizDe2Dimesoes {

	public static void main(String[] args) {
		//Criaremos o vetor referente aos dias do mês com apenas 1 semana, para 
		//simplificar.
		Double faturamentoTotal = 0.0;
		Double faturamentoDiario = 0.0;
		Double [] faturamentoJaneiro = new Double[6];
		Double [] faturamentoFevereiro = new Double[6];
		Double [] faturamentoMarco = new Double[6];
		Integer meses = 0;
	
		meses = Integer.parseInt(JOptionPane.showInputDialog("Escolha "
				+ "o mês para adicionar o faturamento: \n" + 
				"1 - Janeiro \n" + "2 - Fevereiro \n" + "3 - Março"));
		switch (meses) {
		case 1:
			for (int i = 1; i <= faturamentoJaneiro.length; i++) {
				faturamentoJaneiro [i] = Double.parseDouble(JOptionPane.showInputDialog(
						"Entre com o faturamento do " + i + "° dia do mês: "));
				faturamentoDiario += faturamentoJaneiro [i];
				faturamentoTotal += faturamentoDiario;
			}
			System.out.println("Faturamento do mês de janeiro: " + faturamentoTotal);
			break;
		case 2: 
			for (int i = 1; i <= faturamentoFevereiro.length; i++) {
				faturamentoFevereiro [i] = Double.parseDouble(JOptionPane.showInputDialog(
						"Entre com o faturamento do " + i + "° dia do mês: "));
				faturamentoDiario += faturamentoFevereiro [i];
				faturamentoTotal += faturamentoDiario;
			}
			System.out.println("Faturamento do mês de fevereiro: " + faturamentoTotal);
			break;
		case 3: 
			for (int i = 1; i <= faturamentoMarco.length; i++) {
				faturamentoFevereiro [i] = Double.parseDouble(JOptionPane.showInputDialog(
						"Entre com o faturamento do " + i + "° dia do mês: "));
				faturamentoDiario += faturamentoFevereiro [i];
				faturamentoTotal += faturamentoDiario;
			}
			System.out.println("Faturamento do mês de março: " + faturamentoTotal);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Mês inválido!");
			break;
		}
		
		Double [] [] faturamentoDoPrimeiroTrimestre = new Double [] [] {
			faturamentoJaneiro,
			faturamentoFevereiro,
			faturamentoMarco};
	}

}
