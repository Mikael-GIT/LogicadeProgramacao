package Listas;

public class ForEach {
	
	public static void main(String[] args) {
		//Sintaxe para percorrer coleções:
		//for (TipoDosElementosDaColecao apelido : colecao) {
		//}
		String [] vect = new String[] {"Maria", "Bob", "Alex"};
		
		
		//Leitura: Para cada "nome" contido em vect, faça: 
		for(String nome : vect) {
			System.out.println(nome);
		}
		
		System.out.println("--------------------------------");
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		//Concorda que ambas as maneiras acima tem o mesmo resultado quando executadas? Mas
		//no laço for each fica muito mais simples percorrer uma collection.
	}
}
