import java.util.Scanner;

// Classe teste Ariane

public class Testeoperacaomatematica {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		menu();

	}

	public static void menu() {

		System.out.println(" =========================================");
		System.out.println(" =============CALCULADORA ================");
		System.out.println(" =========================================");
		System.out.println(" Escolha a operação desejada: ");
		System.out.println(" 1 - SOMA           ");
		System.out.println(" 2 - SUBTRAÇÃO      ");
		System.out.println(" 3 - MULTIPLICAÇÃO  ");
		System.out.println(" 4 - DIVISÃO        ");
		System.out.println(" 5 - SAIR           ");
		int opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			Soma();
			break;
		case 2:
			Subtracao();
		case 3:
			Multiplicacao();
			break;
		case 4:
			Divisao();
			break;
		case 5:
			System.out.println(" Saindo !!!");
			System.exit(0);
		default:
			System.out.println(" Opção inválida!!!!");
			break;

		}

	}

	private static void Soma() {
		
		 // Este fiz diferente para testar
		Soma soma = new Soma();
		soma.calcula(2, 3);

		menu();

	}

	private static void Subtracao() {

		OperacaoMatematica subtração = new Subtracao();
		subtração.calcula(5, 2);

		menu();
	}

	private static void Multiplicacao() {
		
		OperacaoMatematica multiplicacao = new Multiplicacao();
		multiplicacao.calcula(5, 2);

		menu();
	}

	
	private static void Divisao() {

		OperacaoMatematica divisao = new Divisao();
		divisao.calcula(10, 2);

		menu();
	}

}
