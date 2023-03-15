import java.util.Scanner;

/**
 *
 * @author Ivaldo Fernandes Barros Neto
 *
 * 3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.  
 */

public class TP01Ex03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int diagonal;
        int area;
        
        System.out.println("Digite a diagonal do quadrado: ");
        diagonal = teclado.nextInt();
        
        area = (diagonal * diagonal)/2;
        System.out.println("A área é: " + area);
    }
    
}
