import java.util.Scanner;

/**
 *
 * @author Ivaldo Fernandes Barros Neto
 *
 * 4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.   
 */

public class TP01Ex04 {
    public static void main(String[] args){
        System.out.println("Digite o valor da base de um tiângulo: ");
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();

	System.out.println("Digite o valor da altura de um tiângulo: ");
        double altura = input.nextDouble();

	double area = (base * altura) / 2;
        
        System.out.println("A área do triângulo é: " + area);
        
    }
}
