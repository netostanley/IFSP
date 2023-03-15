import java.util.Scanner;

/**
 *
 * @author Ivaldo Fernandes Barros Neto
 *
 * 15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
 * dólares. Calcular e exibir o valor correspondente em Reais (R$).   
 */

public class TP01Ex15 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double Vdolar;
		double Qdolar;
		double real;

		System.out.println("Digite a cotação do dolar: ");
		Vdolar = teclado.nextDouble();

		System.out.println("Digite a quatidade de dolares: ");
		Qdolar = teclado.nextDouble();

		real = Vdolar * Qdolar;

		System.out.println("O valor em reais é de: " + real); 
	}
}

		