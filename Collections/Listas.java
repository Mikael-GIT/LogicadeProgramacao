package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
	public static void main(String[] args) {
		//Lista � uma estrutura de dados.
		//� homog�nia, ou seja, s� aceita dados do mesmo tipo. Se for double, s� aceita double,
		//se for String s� aceita String, se for Endere�o s� aceita endere�o e assim por diante.
		//Inicia vazia, e seus elementos s�o alocados din�micamente.
		//Ordenada (Elementos acessados por meio de posi��es). (0), (1), (2)... (5)
		
		//Tipo (interface): List
		//Classes que implementam a intercace List: ArrayList, LinkedList, etc.
		
		//*Vantagens:
		//Tamanho Vari�vel
		//Facilidade para se realizar inser��es e dele��es.
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Mikael");
		nomes.add("Maria");
		nomes.add("Ana");
		nomes.add(2, "Marcos"); //Adicionando num indice espec�fico.
		nomes.add("Joao");
		nomes.add("Joana");
		nomes.add("Beatriz");
		nomes.add("Am�ndio");
		nomes.add("Alok");
		
		System.out.println("Tamanho da lista: " + nomes.size());
	
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		
		nomes.remove("Ana"); //Veja que a lista � capaz de remover um item por compara��o do valor
		//no remove. A lista � capaz de remover um dado a partir da compara��o do valor com outro.
		
		nomes.remove(1);//removendo por indice.
		
		nomes.removeIf(x -> x.charAt(0) == 'M'); //Removendo todos da lista que come�a com M.
		//Definindo uma condi��o.
		System.out.println("----------------------------");
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}

		
		System.out.println("-------------------");
		System.out.println("Index of Beatriz: " + nomes.indexOf("Beatriz"));
		System.out.println("Index of Beatriz: " + nomes.indexOf("Paulo")); //Veja que o resultado
		//� negativo. Quando o resultado da pesquisa for negativo, � porque n�o existe este dado na
		//lista.
		
		
		System.out.println("-------------------");
		//Filtrando uma lista:
		
		List<String> result = nomes.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String list : result) {
			System.out.println("Nome: " + list);
		}
		
		System.out.println("-------------------");
		//Procurando o primeiro nome da lista que come�a com A.
		String nome = nomes.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(nome);
	}
}
