package EstruturaDeRepeticao;

public interface EstruturaFor {
	public static void main(String[] args) {
		
//		for(int i = 0; i < 5; i++) {
//			System.out.println("Uma qualquer frase.");
//		}
		
//		Double [] carrinhoDeCompras = new Double[] {50.0, 50.0, 50.0, 50.0, 50.0};
//		Double total = 0.0;
//		for (int i = 0; i < carrinhoDeCompras.length; i++) {
//			System.out.println("Iteração: " + i + ", Total: " + total);
//			total += carrinhoDeCompras[i];
//		}
//		System.out.println("Total: " + total);
		
//		for(int i = 0; i < 10; i++) {
//			if(i == 5) {
//				System.out.println("Vai parar!");
//				break;
//			}
//			System.out.println("Iteração: " + i);
//		}
		
//		for(int i = 0; i < 10; i++) {
//			if(i == 5) {
//				System.out.println("Vai continuar");
//				continue;
//			}
//			System.out.println("Iteração: " + i);
//		}
		
		Integer [] produtos = new Integer[] {100, 225, 300, 500, 900, 459, 945, 257, 904, 205};
		for(int i = 0; i < produtos.length; i++) {
			Integer produto = produtos[i];
			System.out.println("Produto de código: " + produto);
			if(produto.equals(257)) {
				System.out.println("Produto encontrando!" + " Código do produto:" + produto);
				break;
			}
		}
		
		
	}
}
