/**
 *
 * @author Ivaldo Fernandes Barros Neto
 *
 * 11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área. 
 *   
 */

import java.util.Scanner;

public class TP01Ex11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int diametro;
        double area;
        
        System.out.println("Digite o diâmetro do círculo: ");
        diametro = teclado.nextInt();
        
        area = Math.PI * (diametro/2) * (diametro/2);
        System.out.println("A área é: " + area);

    }
    
}
