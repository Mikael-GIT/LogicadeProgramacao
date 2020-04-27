package EstruturaDeRepeticao;

import java.util.Scanner;

public class NumerosDivisiveisPorQuatroComWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de n�meros a serem verificados: ");
		int quantidadeDeNumeros = scan.nextInt();
		
		final Integer divisor = 4;
		Integer numero;
		int [] numeros = new int[quantidadeDeNumeros];
		
		int i = 0;
		while(i < numeros.length) {
			i++;
			System.out.println("Entre com um n�mero: " + "[Digite 0 para parar]");
			numeros[i] = scan.nextInt();
			numero = numeros[i];
			if(numero == 0) {
				break;
			}
			Integer moduloDeQuatro = numero % divisor;
			if(moduloDeQuatro == 0) {
				System.out.println("O n�mero " + numero + " � divis�vel por 4: ");
			} else {
				System.out.println("O n�mero n�o � divis�vel por 4.");
			}
		}
			
		scan.close();

	}

}
