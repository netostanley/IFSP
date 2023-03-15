import java.util.Scanner;

/**
 *
 * @author Ivaldo Fernandes Barros Neto
 *
 * 18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
 * valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
 * que deverá ser devolvido.   
 */

public class TP01Ex18 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double p1;
		double p2;
		double p3;
		double p4;
		double p5;
		double total;
		double pagar;
		double troco;

		System.out.println("Digite o valor de cinco produtos: ");
		p1 = teclado.nextDouble();
		p2 = teclado.nextDouble();
		p3 = teclado.nextDouble();
		p4 = teclado.nextDouble();
		p5 = teclado.nextDouble();

		total = p1 + p2 + p3 + p4 + p5;

		do {

			System.out.println("Digite a quantia do pagamento: ");		
			pagar = teclado.nextDouble();

			if (pagar < total)
			{

				System.out.println("O valor digitado é insuficiente para o pagamento ");

			}	

		}

		while (pagar < total);

		troco = pagar - total;

		System.out.println("Seu troco é de: " + troco);	
	}
}

		