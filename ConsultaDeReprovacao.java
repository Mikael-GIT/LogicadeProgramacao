package Variaveis;

import java.util.Scanner;

public class ConsultaDeReprovacao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota;
		final double notaMinimaParaPassar = 70;
		
		System.out.println("Qual � a nota do aluno?");
		nota = scan.nextDouble();
		
		boolean aprovado = nota >= notaMinimaParaPassar; //Se a nota for maior do que 70
		//ser� atribuido o valor true para a vari�vel booleana.
		
		if(aprovado) { //se o aluno for aprovado, execute: 
			System.out.println("O aluno foi aprovado"); 
		//Senao, execute:
		} else System.out.println("Aluno foi reprovado");
	}

}
