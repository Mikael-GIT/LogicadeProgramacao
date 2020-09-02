package EstruturaIf;

import javax.swing.JOptionPane;

public class VerificarSePassouNoConcurso {

	public static void main(String[] args) {
		Double notaPortugues;
		Double notaMatematica;
		Double notaTotalDoCandidato = null;
		
		final Double notaMinimaDaMateria = 60.0;
		final Double notaMinimaParaPassar = 150.0;
		
		notaPortugues = Double.parseDouble(JOptionPane.showInputDialog
				("Entre com a nota de português: \n Nota precisa ser >= 0 e <= 100"));
		notaMatematica = Double.parseDouble(JOptionPane.showInputDialog
				("Entre com a nota de matemática: \n Nota precisa ser >= 0 e <= 100"));
		
		Boolean verificarCriteriosDeNotaPortugues = notaPortugues >= 0 && notaPortugues <= 100;
		Boolean verificarCriteriosDeNotaMatematica = notaMatematica >= 0 && notaMatematica <= 100;
		Boolean criteriosDeNotaForamAtentidos = verificarCriteriosDeNotaPortugues && verificarCriteriosDeNotaMatematica;
		if(criteriosDeNotaForamAtentidos) {
			notaTotalDoCandidato = notaPortugues + notaMatematica;
		} else {
			JOptionPane.showMessageDialog(null, "Os critérios de nota não foram atendidos.");
		}
		
		Boolean possuiNotaTotalParaPassar = notaTotalDoCandidato >= notaMinimaParaPassar;
		Boolean tirouNotaMinimaEmPortugues = notaPortugues >= notaMinimaDaMateria;
		Boolean tirouNotaMinimaEmMatematica = notaMatematica > notaMinimaDaMateria;
		
		Boolean candidatoFoiAprovado = possuiNotaTotalParaPassar 
				&& tirouNotaMinimaEmPortugues && tirouNotaMinimaEmMatematica;
		
		if(candidatoFoiAprovado) {
			JOptionPane.showMessageDialog(null, "O candidato foi aprovado! \n" + 
		"Nota total: " + notaTotalDoCandidato + "\nNota em matemática: " + 
					notaMatematica + "\nNota em português: " + notaPortugues);
		} else {
			JOptionPane.showMessageDialog(null, "Candidato não aprovado!");
		}
	}

}
