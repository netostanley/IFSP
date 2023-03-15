import java.util.Scanner;

/**
 *
 * @author Ivaldo Fernandes Barros Neto
 *
 * 17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
 * cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.   
 */

public class TP01Ex17 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1;
		int n2;
		double R;

		System.out.println("Digite o primeiro número: ");
		n1 = teclado.nextInt();

		System.out.println("Digite o segundo número: ");
		n2 = teclado.nextInt();

		R = Math.pow(n1, n2);

		System.out.println("O primeiro número elevado ao segundo é: " + R); 
	}
}

		