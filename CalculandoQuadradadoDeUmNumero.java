package Variaveis;

import java.util.Scanner;

public class CalculandoQuadradadoDeUmNumero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double base;
		int expoente;
		double resultado;
		
		System.out.println("Entre com o número a ser elevado ao quadrado: ");
		base = scan.nextDouble();
		
		resultado = base * base;
		System.out.println("O valor do número " + base + " elevado ao quadrado é: " + resultado);
	}

}
