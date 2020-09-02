package MatrizDe1Dimensao;

import javax.swing.JOptionPane;

public class CadastrandoTarefas {

	public static void main(String[] args) {
		String [] tarefas = new String[6];
		for (int i = 1; i < tarefas.length; i++) {
			tarefas [i] = JOptionPane.showInputDialog(
					"Digite a " + i + "° tarefa mais importante do dia.");
		}
		System.out.println("Principais tarefas do dia: ");
		for (int j = 0; j < tarefas.length; j++) {
			System.out.println(tarefas[j]);
		}
	}

}
