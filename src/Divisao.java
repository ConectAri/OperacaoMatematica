
public class Divisao implements OperacaoMatematica {

	// Construtor
	
	public Divisao() {
		
	}
	
	
	@Override
	public int calcula(int a, int b) {
		
		System.out.printf(" A divisão de %d e %d será  %d.\n" , a, b,(a/b), ".");
		System.out.println(" ");
		
		return (a / b);
	}

}
