package Operadores;

import javax.swing.JOptionPane;

public class VerificarPossivelAposentadoria {
	static final Integer IDADE_MINIMA_PARA_SE_APOSENTAR = 55;
	static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;
	public static void main(String[] args) {
		Integer idade = 0;
		Integer tempoDeContribuicao = 0;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade?"));
		tempoDeContribuicao = Integer.parseInt(JOptionPane.showInputDialog("Há quanto tempo você contribui com a previdência?"));
		
		Boolean podeAposentar = (idade >= IDADE_MINIMA_PARA_SE_APOSENTAR) && (tempoDeContribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO);
		
		if(podeAposentar) {
			JOptionPane.showMessageDialog(null, "Sim, você pode se aposentar.");
		} else {
			JOptionPane.showMessageDialog(null, "Você não cumpre com os requisitos para se aposentar.");
		}
	}

}
