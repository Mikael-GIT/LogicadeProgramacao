package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantos funcionários serão registrados? ");
		Integer numReg = scan.nextInt();
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		for (int i = 0; i < numReg; i++) {
			System.out.println("Id: ");
			Integer id = scan.nextInt();
			
			System.out.println("Nome: ");
			String nome = scan.next();
			
			System.out.println("Salário: ");
			Double salario = scan.nextDouble();
			Funcionario funcionario = new Funcionario(id, nome, salario);
			funcionarios.add(funcionario);
		}
		
		System.out.println("Entre com o ID do funcionário que receberá o aumento: ");
		Integer idSalario = scan.nextInt();
		
		Integer pos = posicao(funcionarios, idSalario);
		if(pos == null) {
			System.out.println("Este ID não existe!");
			System.exit(0);
		} else {
			System.out.println("Entre com a porcentagem: ");
			Double porcentagem = scan.nextDouble();
			funcionarios.get(pos).aumentarSalario(porcentagem);
		}
		
		
		for (Funcionario funcionario : funcionarios) {
		System.out.println(funcionario);
	}
		
	}
	
	public static Integer posicao(List<Funcionario> lista, int id) {
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
}
