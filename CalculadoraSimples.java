package Operadores;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double x = null;
		Double y = null;
		Integer sinalDaOperacao = null;
		Double resultado;
		
		System.out.println("Entre com o primeiro n�mero: ");
		x = scan.nextDouble();
		
		System.out.println("Entre com o segundo n�mero: ");
		y = scan.nextDouble();
		
		System.out.println("Entre com o tipo de opera��o: \n 1 = adi��o \n 2 = subtra��o \n 3 = multiplica��o \n 4 = divis�o");
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
		System.out.println("O resultado �: " + resultado);
		
		scan.close();

	}

}
