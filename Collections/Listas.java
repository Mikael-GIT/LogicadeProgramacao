package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
	public static void main(String[] args) {
		//Lista é uma estrutura de dados.
		//É homogênia, ou seja, só aceita dados do mesmo tipo. Se for double, só aceita double,
		//se for String só aceita String, se for Endereço só aceita endereço e assim por diante.
		//Inicia vazia, e seus elementos são alocados dinâmicamente.
		//Ordenada (Elementos acessados por meio de posições). (0), (1), (2)... (5)
		
		//Tipo (interface): List
		//Classes que implementam a intercace List: ArrayList, LinkedList, etc.
		
		//*Vantagens:
		//Tamanho Variável
		//Facilidade para se realizar inserções e deleções.
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Mikael");
		nomes.add("Maria");
		nomes.add("Ana");
		nomes.add(2, "Marcos"); //Adicionando num indice específico.
		nomes.add("Joao");
		nomes.add("Joana");
		nomes.add("Beatriz");
		nomes.add("Amândio");
		nomes.add("Alok");
		
		System.out.println("Tamanho da lista: " + nomes.size());
	
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		
		nomes.remove("Ana"); //Veja que a lista é capaz de remover um item por comparação do valor
		//no remove. A lista é capaz de remover um dado a partir da comparação do valor com outro.
		
		nomes.remove(1);//removendo por indice.
		
		nomes.removeIf(x -> x.charAt(0) == 'M'); //Removendo todos da lista que começa com M.
		//Definindo uma condição.
		System.out.println("----------------------------");
		for(String nome : nomes) {
			System.out.println("Nome: " + nome);
		}

		
		System.out.println("-------------------");
		System.out.println("Index of Beatriz: " + nomes.indexOf("Beatriz"));
		System.out.println("Index of Beatriz: " + nomes.indexOf("Paulo")); //Veja que o resultado
		//é negativo. Quando o resultado da pesquisa for negativo, é porque não existe este dado na
		//lista.
		
		
		System.out.println("-------------------");
		//Filtrando uma lista:
		
		List<String> result = nomes.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String list : result) {
			System.out.println("Nome: " + list);
		}
		
		System.out.println("-------------------");
		//Procurando o primeiro nome da lista que começa com A.
		String nome = nomes.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(nome);
	}
}
