package Operadores;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		Integer adicao = 1 + 1;
		System.out.println("Adi��o: " + adicao);

		Integer subtracao = 1 - 1;
		System.out.println("Subtra��o: " + subtracao);
		
		Integer multiplicacao = 2 * 2;
		System.out.println("Multiplica��o: " + multiplicacao);
		
		Integer divisao = 4 / 2;
		System.out.println("Divis�o: " + divisao);
		
		Integer modulo = 7 % 4; //� o resto de uma divisao. Quanto sobra da divis�o
		System.out.println("Modulo: " + modulo);
		
		Integer precedencia01 = 1 + 1 * 5;
		System.out.println("Precedencia 01: " + precedencia01);
		
		Integer precedencia02 = (1 + 1) * 5;
		System.out.println("Precedencia 02: " + precedencia02);
	}

}
