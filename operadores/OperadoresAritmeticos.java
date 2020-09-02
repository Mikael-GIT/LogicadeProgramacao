package Operadores;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		Integer adicao = 1 + 1;
		System.out.println("Adição: " + adicao);

		Integer subtracao = 1 - 1;
		System.out.println("Subtração: " + subtracao);
		
		Integer multiplicacao = 2 * 2;
		System.out.println("Multiplicação: " + multiplicacao);
		
		Integer divisao = 4 / 2;
		System.out.println("Divisão: " + divisao);
		
		Integer modulo = 7 % 4; //É o resto de uma divisao. Quanto sobra da divisão
		System.out.println("Modulo: " + modulo);
		
		Integer precedencia01 = 1 + 1 * 5;
		System.out.println("Precedencia 01: " + precedencia01);
		
		Integer precedencia02 = (1 + 1) * 5;
		System.out.println("Precedencia 02: " + precedencia02);
	}

}
