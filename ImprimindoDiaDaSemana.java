package EstruturaIf;

import java.util.Scanner;

public class ImprimindoDiaDaSemana {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer diaSemana = 0;
		System.out.println("Entre com o dia da semana: ");
		diaSemana = scan.nextInt();
		
		switch (diaSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Ter�a");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("S�bado");
			break;
		default: System.err.println("Dia da semana inv�lido.");
			break;
		}

	}

}
