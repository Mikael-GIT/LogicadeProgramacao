package EstruturaDeRepeticao;

import java.util.Scanner;

public class NumerosDivisiveisPorQuatroComWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de números a serem verificados: ");
		int quantidadeDeNumeros = scan.nextInt();
		
		final Integer divisor = 4;
		Integer numero;
		int [] numeros = new int[quantidadeDeNumeros];
		
		int i = 0;
		while(i < numeros.length) {
			i++;
			System.out.println("Entre com um número: " + "[Digite 0 para parar]");
			numeros[i] = scan.nextInt();
			numero = numeros[i];
			if(numero == 0) {
				break;
			}
			Integer moduloDeQuatro = numero % divisor;
			if(moduloDeQuatro == 0) {
				System.out.println("O número " + numero + " é divisível por 4: ");
			} else {
				System.out.println("O número não é divisível por 4.");
			}
		}
			
		scan.close();

	}

}
