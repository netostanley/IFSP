/**
 *
 * @author Ivaldo Fernandes Barros Neto
 *
 * 10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
 * exibir sua temperatura equivalente em Fahrenheit.   
 */

import java.util.Scanner;

public class TP01Ex10 {
    public static void main(String[] args){
        System.out.println("Digite um valor em graus Celsius: ");
        Scanner input = new Scanner(System.in);
        double graus= input.nextDouble();
	

        double conversao = (graus * 1.8) + 32;
        
        System.out.println("A conversão de graus Celsius para fahrenheit é de: " + conversao + " fahrenheit");
        
    }
}