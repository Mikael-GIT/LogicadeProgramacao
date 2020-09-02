package MatrizDe1Dimensao;

import java.util.Scanner;

public class MatrizDeUmaDimensao {
	public static void main(String[] args) {
//		String [] cardapio = new String[] {"Calabresa", "Atum", "Queijo", "Presunto"};
//		
//		System.out.println("Escolha o sabor da pizza: ");
//		
//		for(int i = 0; i < cardapio.length; i++) {
//			System.out.println("[" + i + "] " + cardapio[i]);
//			
//			
//		}
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Digite o número referente ao sabor: ");
//		Integer saborEscolhido = scan.nextInt();
//		
//		System.out.println("Você escolheu o sabor: " + saborEscolhido);
//		scan.close();
		
//		String [] cardapio = new String[] {"Calabresa", "Atum", "Queijo", "Presunto"};
//		cardapio [3] = "Portuguesa";
//		for(int i = 0; i < cardapio.length; i++) {
//			System.out.println(cardapio[i]);
//			
//			
//	    }
		Scanner scan = new Scanner(System.in);
		String [] cardapio = new String[4];
		for(int i = 0; i < cardapio.length; i++) {
			System.out.println("Entre com um sabor: ");
			cardapio [i] = scan.nextLine();
		}
		System.out.println("Sabores:");
		for(int j = 0; j < cardapio.length; j++) {
			System.out.println(cardapio[j]);
		}
	}
}
