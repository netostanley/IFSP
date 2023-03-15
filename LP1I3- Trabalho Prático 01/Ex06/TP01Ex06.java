/**
 *
 * @author Ivaldo Fernandes Barros Neto
 *
 * 6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.   
 */

import java.util.Scanner;

public class TP01Ex06 {
    public static void main(String[] args){
        System.out.println("Digite 4 valores: ");
        Scanner input = new Scanner(System.in);
        double numero1 = input.nextDouble();
	double numero2 = input.nextDouble();
	double numero3 = input.nextDouble();
	double numero4 = input.nextDouble();

        double media = (numero1 + numero2 + numero3 + numero4)/4;
        
        System.out.println("A média aritmética é: " + media);
        
    }
}
