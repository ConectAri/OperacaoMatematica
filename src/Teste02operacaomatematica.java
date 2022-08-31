import java.util.Scanner;

//Classe teste feito pelo grupo, nesta tem interação com usuário e com do e While

public class Teste02operacaomatematica {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		

		System.out.println("------------------------");
		System.out.println("----CALCULADORA---------");
		System.out.println("------------------------");

		System.out.println("Informe o primeiro nímero :");
		int primeiroNumero = leia.nextInt();
		System.out.println("Informe o segundo nímero :");
		int segundoNumero = leia.nextInt();

		int opcao = 0 ;
		
		do {
			
			System.out.println("Escolha a operaçao desejada :");
			System.out.println(" 1 -SOMA");
			System.out.println(" 2- SUBTRAÇÃO");
			System.out.println(" 3- MULTIPLICAÇÂO");
			System.out.println(" 4- DIVISÃO");
			System.out.println(" 5- SAIR");
			 opcao = leia.nextInt();
			
						

			switch (opcao) {
			case 1:
				OperacaoMatematica soma = new Soma();
				soma.calcula(primeiroNumero, segundoNumero);
				break;

			case 2:
				OperacaoMatematica subtracao = new Subtracao();
				subtracao.calcula(primeiroNumero, segundoNumero);
				break;

			case 3:
				OperacaoMatematica multiplicacao = new Multiplicacao();
				multiplicacao.calcula(primeiroNumero, segundoNumero);
				break;

			case 4:
				OperacaoMatematica divisao = new Divisao();
				divisao.calcula(primeiroNumero, segundoNumero);
				break;
				
			case 5:
				
				System.out.println(" Sistema finalizado com sucesso!");


				break;
							
			default:

				System.out.println("Opção invalida!");
			}
			
		//} while (opcao > 0 || opcao !=5 );
			
		} while (opcao !=5 );

			leia.close();
		
	}
}
