import java.util.Scanner;

/**
 *
 * @author Ivaldo Fernandes Barros Neto
 *
 * 5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.   
 */


public class TP01Ex05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int diametro;
        double volume;
        
        System.out.println("Digite o diâmetro da esfera: ");
        diametro = teclado.nextInt();
        
        volume = 4/3 * Math.PI * (diametro/2);
        System.out.println("O volume é: " + volume);

    }
    
}
