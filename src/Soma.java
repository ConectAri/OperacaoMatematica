
public class Soma implements OperacaoMatematica {

	// Construtor
	
	public Soma() {
		
	}
	
	@Override
	public  int calcula(int a, int b) {
		
		System.out.printf(" A soma de %d e %d será  %d.\n " , a, b,(a+b));
		System.out.println(" ");
		
		return (a + b);
		
		//System.out.println(" A soma é: " + (a + b) );
	}

}
