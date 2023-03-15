import java.util.Scanner;

/**
 *
 * @author Ivaldo Fernandes Barros Neto
 *
 * 1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
 */

public class TP01Ex01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int baseRet;
		int alturaRet;
		int area;

		System.out.println("Digite a base do retângulo: ");
		baseRet = teclado.nextInt();

		System.out.println("Digite a altura do retângulo: ");
		alturaRet = teclado.nextInt();

		area = baseRet * alturaRet;

		System.out.println("A área é de: " + area); 
	}
}

		