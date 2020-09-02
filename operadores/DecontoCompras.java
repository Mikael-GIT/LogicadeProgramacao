package Operadores;

import java.util.Scanner;

public class DecontoCompras {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final Double valorParaDescontoDoFrete = 100.0;
		Double freteDaCompra;
		Double valorDaCompra;
		Double valorFinal;
		System.out.println("Qual é o valor da compra?");
		valorDaCompra = scan.nextDouble();
		
		
		Boolean possuiDescontoDoFrete = valorDaCompra > valorParaDescontoDoFrete;
		
		if(possuiDescontoDoFrete) {
			freteDaCompra = 0.0;
		} else {
			freteDaCompra = 15.0;
		}
		
		valorFinal = valorDaCompra + freteDaCompra;
		System.out.println("O valor total da compra é: " + valorFinal);
		scan.close();
	}

}
