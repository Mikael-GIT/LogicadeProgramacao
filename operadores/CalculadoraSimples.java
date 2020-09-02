package Operadores;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double x = null;
		Double y = null;
		Integer sinalDaOperacao = null;
		Double resultado;
		
		System.out.println("Entre com o primeiro número: ");
		x = scan.nextDouble();
		
		System.out.println("Entre com o segundo número: ");
		y = scan.nextDouble();
		
		System.out.println("Entre com o tipo de operação: \n 1 = adição \n 2 = subtração \n 3 = multiplicação \n 4 = divisão");
		sinalDaOperacao = scan.nextInt();
		
		if(sinalDaOperacao == 1) {
			resultado = x + y;
		} else if (sinalDaOperacao == 2) {
			resultado = x - y;
		} else if (sinalDaOperacao == 3) {
			resultado = x * y;
		} else {
			resultado = x / y;
		}
		System.out.println("O resultado é: " + resultado);
		
		scan.close();

	}

}
