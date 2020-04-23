package Variaveis;

import java.util.Scanner;

public class EncontrandoValorQuantDesc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double quantidadeProduto;
		Double valorProduto;
		Double porcentagemDeDesconto;
		
		System.out.print("Entre com o valor do produto:");
		valorProduto = scan.nextDouble();
		
		System.out.println("Entre com a quantidade do produto: [Caso compre mais do que 10 produtos, haverá um desconto de 10%");
		quantidadeProduto = scan.nextDouble();
		
		Double subtotal = valorProduto * quantidadeProduto;		
		
		Boolean descontoAplicado = quantidadeProduto > 10;
		
		if(descontoAplicado) {
			porcentagemDeDesconto = 10.0;
		} else {
			porcentagemDeDesconto = 0.0;
		}
		
		Double valorDesconto = (subtotal * porcentagemDeDesconto)/100;
		Double valorFinal = subtotal - valorDesconto;
		System.out.println("Valor final do produto: " + valorFinal);
		scan.close();

	}

}
