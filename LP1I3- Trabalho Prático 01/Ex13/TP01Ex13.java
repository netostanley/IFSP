/**
 *
 * @author Ivaldo Fernandes Barros Neto
 *
 * 13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
 * valores da velocidade inicial (em m/s), da aceleração (m/s²) e do tempo de percurso
 * (em s) que serão digitados. 
 *   
 */

import java.util.Scanner;

public class TP01Ex13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int v0;
        int a;
        int t;
        double vf;
        
        System.out.println("Digite a velocidade inicial: ");
        v0 = teclado.nextInt();
        
        System.out.println("Digite a aceleração: ");
        a = teclado.nextInt();
        
        System.out.println("Digite o tempo de viagem: ");
        t = teclado.nextInt();
        
        vf = ((v0 + (a*t))* 3.6);
        
        System.out.println("A Velocidade final é: " + vf);      
    }
    
}