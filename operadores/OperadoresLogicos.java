package Operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100 = true;
		Boolean periodoDePromocao = true;
		Boolean jaFezCompraNaLoja = false;
		Boolean pagamentoAVista = true;
		
//Na linha abaixo, estamos dizendo que o aplicarDesconto deve ser verdadeiro
//se o carrinho tiver uma compra maior do que 100 reais e o estiver no periodo de promocao.
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;
//
//		if(aplicarDesconto) {
//			System.out.println("Sim! Aplique o desconto.");
//		} else {
//			System.out.println("Não aplique o desconto.");
//		}
		
		//Nesse caso o desconto será aplicado se o carrinho tiver com uma compra
		//maior do que 100 reais ou se estiver no período de promoção.
		
//		Boolean aplicarDesconto = periodoDePromocao && carrinhoMaiorQue100 && jaFezCompraNaLoja;
		
//		Boolean aplicarDesconto = periodoDePromocao || carrinhoMaiorQue100 || jaFezCompraNaLoja;
		
		Boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja) && pagamentoAVista;
		if(aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto");
		} else {
			System.out.println("Não aplique o desconto.");
		}
	}

}
