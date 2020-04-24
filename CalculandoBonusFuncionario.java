package EstruturaIf;

import java.util.Scanner;

public class CalculandoBonusFuncionario {

	public static void main(String[] args) {
		Double meta;
		Double faturamento;
		Double mediaSalarial = null;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a meta de faturamento do ano anterior: ");
		meta = scan.nextDouble();
		
		System.out.println("Informe o quanto foi faturado no ano anterior: ");
		faturamento = scan.nextDouble();
		
		System.out.println("Informe a m�dia salarial dos funcion�rios: ");
		mediaSalarial = scan.nextDouble();
		
		Double OitentaPorcentoDaMeta = (meta * 80.0) / 100.0;
		
		Boolean bateuAMeta = faturamento >= meta;
		Boolean faturouOitentaPorcento =  faturamento >= OitentaPorcentoDaMeta;
		if(bateuAMeta) {
			System.out.println("Voc� vai receber 100% do b�nus! Ele ser� de: " + 
					mediaSalarial);
		} else if (faturouOitentaPorcento) {
			Double oitentaPorcentoDaMediaSalarial = (mediaSalarial * 80) / 100;
			System.out.println("Voc� vai ganhar um b�nus de 80%! Ele ser� de: " 
					+ oitentaPorcentoDaMediaSalarial);
		} else {
			System.out.println("Os funcion�rios n�o obtiveram b�nus.");
		}
		scan.close();

	}

}
