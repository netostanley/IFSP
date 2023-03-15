import java.util.Scanner;

/**
 *
 * @author Ivaldo Fernandes Barros Neto
 *
 * 9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
 * valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
 */

public class TP01Ex09 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int r;
		int i;
		int V;

		System.out.println("Digite a resistência: ");
		r = teclado.nextInt();

		System.out.println("Digite a corrente elétrica: ");
		i = teclado.nextInt();

		V = r * i;

		System.out.println("A tensão é de: " + V); 
	}
}

		