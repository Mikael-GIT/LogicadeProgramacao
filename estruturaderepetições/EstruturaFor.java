package EstruturaDeRepeticao;

public interface EstruturaFor {
	public static void main(String[] args) {
		
//		for(int i = 0; i < 5; i++) {
//			System.out.println("Uma qualquer frase.");
//		}
		
//		Double [] carrinhoDeCompras = new Double[] {50.0, 50.0, 50.0, 50.0, 50.0};
//		Double total = 0.0;
//		for (int i = 0; i < carrinhoDeCompras.length; i++) {
//			System.out.println("Itera��o: " + i + ", Total: " + total);
//			total += carrinhoDeCompras[i];
//		}
//		System.out.println("Total: " + total);
		
//		for(int i = 0; i < 10; i++) {
//			if(i == 5) {
//				System.out.println("Vai parar!");
//				break;
//			}
//			System.out.println("Itera��o: " + i);
//		}
		
//		for(int i = 0; i < 10; i++) {
//			if(i == 5) {
//				System.out.println("Vai continuar");
//				continue;
//			}
//			System.out.println("Itera��o: " + i);
//		}
		
		Integer [] produtos = new Integer[] {100, 225, 300, 500, 900, 459, 945, 257, 904, 205};
		for(int i = 0; i < produtos.length; i++) {
			Integer produto = produtos[i];
			System.out.println("Produto de c�digo: " + produto);
			if(produto.equals(257)) {
				System.out.println("Produto encontrando!" + " C�digo do produto:" + produto);
				break;
			}
		}
		
		
	}
}
