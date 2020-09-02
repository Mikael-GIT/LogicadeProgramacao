package EstruturaIf;

public class EstruturaIf {

	public static void main(String[] args) {
		
		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;
		
		Integer tempoDeAberturaDaConta = 2;
		Integer tempoMinimoDeAberturaDaConta = 5;
		
		Double saldoDaConta = 200.0;
		
		Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo; //Metade do valor que está 
		//sendo pedindo como emprestimo.
		Boolean aContaTemTempoSuficienteDeAbertura = tempoDeAberturaDaConta > tempoMinimoDeAberturaDaConta;
		Boolean temNomeLimpo = saldoDaConta >= 0;
		
//		Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor 
//				&& (aContaTemTempoSuficienteDeAbertura && temNomeLimpo);
		
		//Para que seja liberado o emprestimo, o valor do if tem que ser true.
		if((movimentacaoMedia * 2) >= emprestimo 
				&& tempoDeAberturaDaConta > tempoMinimoDeAberturaDaConta
				&& saldoDaConta >= 0) {
			System.out.println("Sim! Pode liberar o emprestimo.");
		} else {
			System.out.println("Não pode liberar o empréstimo.");
		}
		
	}
}
