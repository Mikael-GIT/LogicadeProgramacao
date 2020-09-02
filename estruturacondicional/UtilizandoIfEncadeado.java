package EstruturaIf;

import java.util.Scanner;

public class UtilizandoIfEncadeado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o peso do lutador: ");
		Double peso = scan.nextDouble();
		
		Boolean pesoLeve = (peso <= 60) && (peso > 0);
		Boolean pesoMedio = peso > 60 && (peso <= 90);
		Boolean pesoPesado = peso > 90;
		
		if(pesoLeve) {
			System.out.println("O lutador � da categoria peso leve.");
		} else if (pesoMedio) {
			System.out.println("O lutador � da categoria peso m�dio.");
		} else if (pesoPesado) {
			System.out.println("O lutador � da categoria peso pesado.");
		} else {
			System.out.println("O lutador n�o se encaixa em categoria alguma.");
		}
		
		scan.close();
	}

}
