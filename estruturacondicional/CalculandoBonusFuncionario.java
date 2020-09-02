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
		
		System.out.println("Informe a média salarial dos funcionários: ");
		mediaSalarial = scan.nextDouble();
		
		Double OitentaPorcentoDaMeta = (meta * 80.0) / 100.0;
		
		Boolean bateuAMeta = faturamento >= meta;
		Boolean faturouOitentaPorcento =  faturamento >= OitentaPorcentoDaMeta;
		if(bateuAMeta) {
			System.out.println("Você vai receber 100% do bônus! Ele será de: " + 
					mediaSalarial);
		} else if (faturouOitentaPorcento) {
			Double oitentaPorcentoDaMediaSalarial = (mediaSalarial * 80) / 100;
			System.out.println("Você vai ganhar um bônus de 80%! Ele será de: " 
					+ oitentaPorcentoDaMediaSalarial);
		} else {
			System.out.println("Os funcionários não obtiveram bônus.");
		}
		scan.close();

	}

}
