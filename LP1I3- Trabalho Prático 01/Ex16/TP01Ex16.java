import java.util.Scanner;

/**
 *
 * @author Ivaldo Fernandes Barros Neto
 *
 * 16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
 * seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
 * Lembre-se que uma função trigonométrica trabalha em radianos.   
 */

public class TP01Ex16{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do ângulo em graus: ");
        double anguloEmGraus = input.nextDouble();

        // Converte o ângulo de graus para radianos
        double anguloEmRadianos = Math.toRadians(anguloEmGraus);

        double seno = Math.sin(anguloEmRadianos);
        double cosseno = Math.cos(anguloEmRadianos);
        double tangente = Math.tan(anguloEmRadianos);
        double secante = 1 / Math.cos(anguloEmRadianos);

        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante);
    }
}
