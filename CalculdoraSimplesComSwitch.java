package Operadores;

import java.util.Scanner;

public class CalculdoraSimplesComSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double x = null;
		Double y = null;
		Integer sinalDaOperacao = null;
		Double resultado = null;
		
		System.out.println("Entre com o primeiro n�mero: ");
		x = scan.nextDouble();
		
		System.out.println("Entre com o segundo n�mero: ");
		y = scan.nextDouble();
		
		System.out.println("Entre com o tipo de opera��o: \n 1 = adi��o \n 2 = subtra��o \n 3 = multiplica��o \n 4 = divis�o");
		sinalDaOperacao = scan.nextInt();
		
		switch (sinalDaOperacao) {
		case 1:
			resultado = x + y;
			break;
		case 2: 
			resultado = x - y;
			break;
		case 3: 
			resultado = x * y;
			break;
		case 4: 
			resultado = x / y;
		default:
			System.out.println("O valor digitado, n�o corresponde a nenhum sinal.");
			break;
		} 
		System.out.println("O resultado �: " + resultado);

	}

}
