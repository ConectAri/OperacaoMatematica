
public class Subtracao implements OperacaoMatematica {
	
	
	// Construtor
	
	public Subtracao() {
		
	}
	

	@Override
	public int calcula(int a, int b) {
		
		System.out.printf(" A subtração de %d e %d será  %d.\n" , a, b,(a-b) , ".");
		System.out.println(" ");
		
		return (a - b);
		
	}

}
