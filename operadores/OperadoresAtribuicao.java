package Operadores;

public class OperadoresAtribuicao {

	public static void main(String[] args) {
		Double numero = 7.0; 
//		numero = numero + 4;
//		System.out.println("N�mero + 4: " + numero);
		
		numero += 4.0;
		System.out.println("N�mero += 4: " + numero);
		
		numero -= 4.0;
		//� a mesma coisa que fazer numero = numero - 4;
		System.out.println("N�mero -= 4: " + numero);
		
		numero *= 4.0;
		//� a mesma coisa que fazer numero = numero * 4;
		System.out.println("N�mero *= 4: " + numero);
		
		numero /= 4.0;
		//� a mesma coisa que fazer numero = numero / 4;
		System.out.println("N�mero /= 4: " + numero);

		numero %= 4.0;
		//� a mesma coisa que fazer numero = numero % 4;
		System.out.println("N�mero %= 4: " + numero);
	}

}
