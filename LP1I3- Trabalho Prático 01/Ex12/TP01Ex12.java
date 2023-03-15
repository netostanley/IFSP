/**
 *
 * @author Ivaldo Fernandes Barros Neto
 *
 * 12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base que serão digitados. 
 *   
 */

import java.util.Scanner;

public class TP01Ex12 {
    public static void main(String[] args){
        System.out.println("Digite o valor do raio de um cone: ");
        Scanner input = new Scanner(System.in);
        double raio = input.nextDouble();

	System.out.println("Digite o valor da altura de um cone: ");
	double altura = input.nextDouble();

        double volume =  (3.14 * (raio * raio) * altura)/3;
        
        System.out.println("O volume é: " + volume + " metros cúbicos");
        
    }
}