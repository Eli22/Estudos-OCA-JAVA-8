import java.util.Scanner;

public class CalculadoraInteligente {
	public static void main(String[] args) {

		int operacao;
		int opcao = 1;
		double numero1;
		double numero2;
		double resultado;

		Scanner entrada = new Scanner(System.in);

		while (opcao == 1) {
		System.out.println("***************************************************");
		System.out.println("* Informe o tipo de operação que deseja realizar  *");
		System.out.println("* 1-soma, 2-subtração, 3-multiplicação, 4-divisão *");
		System.out.println("***************************************************");
		operacao = entrada.nextInt();


			switch (operacao) {

			// SOMA
			case 1:
				System.out.println("Você escolheu a opção de SOMA");
				System.out.println();
				System.out.println("Insira o primeiro valor:");
				numero1 = entrada.nextInt();
				System.out.println("Insira o segundo valor:");
				numero2 = entrada.nextInt();
				resultado = numero1 + numero2;
				System.out.println("A soma é: " + resultado);
				break;
			// SUBTRAÇÃO
			case 2:
				System.out.println("Você escolheu a opção de SUBTRAÇÃO");
				System.out.println();
				System.out.println("Insira o primeiro valor:");
				numero1 = entrada.nextInt();
				System.out.println("Insira o segundo valor:");
				numero2 = entrada.nextInt();
				resultado = numero1 - numero2;
				System.out.println("A subtração é: " + resultado);
				break;
			// MULTIPLICAÇÃO
			case 3:
				System.out.println("Você escolheu a opção de MULTIPLICAÇÃO");
				System.out.println();
				System.out.println("Insira o primeiro valor:");
				numero1 = entrada.nextInt();
				System.out.println("Insira o segundo valor:");
				numero2 = entrada.nextInt();
				resultado = numero1 * numero2;
				System.out.println("A multiplicação é: " + resultado);
				break;
			// DIVISÃO
			case 4:
				System.out.println("Você escolheu a opção de DIVISÃO");
				System.out.println();
				System.out.println("Insira o primeiro valor:");
				numero1 = entrada.nextInt();
				System.out.println("Insira o segundo valor:");
				numero2 = entrada.nextInt();
				resultado = numero1 / numero2;
				System.out.println("A divisão é: " + resultado);
				break;

			default:
				System.out.println(
						"Você não digitou nenhuma das opções correspondentes, por gentileza, rode o programa novamente!");
			}
			System.out.println();
			System.out.println("Deseja realizar mais alguma operação?");
			System.out.println("1-Sim");
			System.out.println("2-Não");
			opcao = entrada.nextInt();
		}
	}

}