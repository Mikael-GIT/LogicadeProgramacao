package Variaveis;

import java.util.Scanner;

public class CalculandoQuadradadoDeUmNumero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double base;
		int expoente;
		double resultado;
		
		System.out.println("Entre com o n�mero a ser elevado ao quadrado: ");
		base = scan.nextDouble();
		
		resultado = base * base;
		System.out.println("O valor do n�mero " + base + " elevado ao quadrado �: " + resultado);
	}

}
