
public class MatrizDeDuasDimensoes {
	public static void main(String[] args) {
		Double [] faturamentoJaneiro = new Double[] {1500.0, 2000.0, 3000.0};
		Double [] faturamentoFevereiro = new Double[] {1800.0, 3000.0, 5000.0};
		Double [] [] faturamentoAnual = new Double [] [] {
			faturamentoJaneiro,
			faturamentoFevereiro};
			//O primeiro indice � referente ao indice do faturamentoAnual e o segundo �
			//referente ao dia do m�s indicado. Veja o exemplo com o m�s de janeiro:
		System.out.println("Faturamento do dia 1� de janeiro: " + faturamentoAnual [0] [0]);
		
		//Podemos pensar que o array de v�rias dimensoes � uma planilha no excel
		//Sendo o primeiro colchete igual a coluna e o segundo colchete � referente
		//a linha, tendo a coluna e a linha, teremos uma celula.
		System.out.println("Faturamento do dia 3� de fevereiro: " + faturamentoAnual [1] [2]);
	
		for (int i = 0; i < faturamentoAnual.length; i++) {
			System.out.println("M�s: " + (i + 1));
			
			Double [] mes = faturamentoAnual [i];
			
			//Na pr�xima linha, estaremos j� usando a matriz do m�s. 
			for (int j = 0; j < mes.length; j++) {
				Double dia = mes [i];
				System.out.println("Dia " + (j + 1) + ": " + dia);
			}
		}
	}
}
