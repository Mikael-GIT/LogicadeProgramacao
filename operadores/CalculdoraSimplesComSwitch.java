package Operadores;

import java.util.Scanner;

public class CalculdoraSimplesComSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double x = null;
		Double y = null;
		Integer sinalDaOperacao = null;
		Double resultado = null;
		
		System.out.println("Entre com o primeiro número: ");
		x = scan.nextDouble();
		
		System.out.println("Entre com o segundo número: ");
		y = scan.nextDouble();
		
		System.out.println("Entre com o tipo de operação: \n 1 = adição \n 2 = subtração \n 3 = multiplicação \n 4 = divisão");
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
			System.out.println("O valor digitado, não corresponde a nenhum sinal.");
			break;
		} 
		System.out.println("O resultado é: " + resultado);

	}

}
