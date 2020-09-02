package Operadores;

public class operadoresRelacionais {

	public static void main(String[] args) {
		
		
		Boolean tresMaiorQueDois = 3 > 2;
		System.out.println("3 > 2? " + tresMaiorQueDois);
		
		Boolean tresMenorQueDois = 3 < 2;
		System.out.println("3 < 2? " + tresMenorQueDois);
		
		Boolean tresMaiorQueTres = 3 > 3;
		System.out.println("3 > 3? " + tresMaiorQueTres);
		
		Boolean tresMaiorOuIgualATres = 3 >= 3;
		System.out.println("3 >= 3? " + tresMaiorOuIgualATres);
		
		Boolean tresMenorOuIgualATres = 3 <= 3;
		System.out.println("3 <= 3? " + tresMenorOuIgualATres);
		
		Boolean doisIgualADois = 2 == 2;
		System.out.println("2 = 2? " + doisIgualADois);
		
		Boolean doisDiferenteDeDois = 2 != 2;
		System.out.println("2 != 2? " + doisDiferenteDeDois);
		
		Boolean doisDiferenteDeSete = 2 != 7;
		System.out.println("2 != 7? " + doisDiferenteDeSete); //    != é igual a diferente
		
		
		Integer quatro = 4;
		
		Boolean quatroMaiorQueQuatro = quatro > quatro;
		System.out.println("Quatro > quatro?" + quatroMaiorQueQuatro);
		
		Boolean quatroMaiorOuIgualAQuatro = quatro >= quatro;
		System.out.println("Quatro >= quatro?" + quatroMaiorOuIgualAQuatro);
		
		Integer centoVinteOito = 128;
		Integer centoVinteOito02 = 128;
		Boolean centoVinteOitoIgualCentoVinteOito = centoVinteOito.equals(centoVinteOito02);
		System.out.println("centoVinteOito.equals(centoVinteOito02)?" + centoVinteOitoIgualCentoVinteOito);
	
		//O == só funciona com objetos até o número 127, depois ele retornará false.
		Boolean centoVinteOitoIgualCentoVinteOito02 = centoVinteOito == centoVinteOito02;
		System.out.println("centoVinteOito.equals(centoVinteOito02)?" + centoVinteOitoIgualCentoVinteOito);
	
	}

}
