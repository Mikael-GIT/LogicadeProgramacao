package EstruturaDeRepeticao;

public class NumerosDivisiveisPorTres {

	public static void main(String[] args) {
		Integer [] numeros = new Integer[] {
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		final Integer divisor = 3;
		for (int i = 0; i < numeros.length; i++) {
			Integer numero = numeros[i];
			int moduloPorTres = numero % divisor;
			if(moduloPorTres == 0) {
				System.out.println("O número é divisivel por 3: " + numeros[i]);
			}
		}
		System.out.println("Fim.");
	}

}
