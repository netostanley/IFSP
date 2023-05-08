/**
 * Exercício 02
 * Agora, desenvolva um programa capaz de testar a classe e os métodos desenvolvidos no
 * exercício anterior.
 *
 * @author Ivaldo Fernandes Barros Neto -  CB3020878
 *
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        Hora horario = new Hora();
        System.out.println("APRESENTANDO O CONSTRUTOR SEM PARÂMETROS");
        System.out.println();
        System.out.println("Neste horário, há " + horario.getSegundos() + " segundos.");
        System.out.println();
        System.out.println(horario.getHora1());
        System.out.println();
        System.out.println(horario.getHora2());
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();

        System.out.println("APRESENTANDO O CONSTRUTOR COM PARÂMETROS");
        System.out.println();
        Hora horario1 = new Hora(1, 2, 3);

        horario1.setHora();
        horario1.setMinuto();
        horario1.setSegundo();

        System.out.println();

        System.out.println("getHora() = " + horario1.getHora());
        System.out.println("getMinuto() = " + horario1.getMinuto());
        System.out.println("getSegundo() = " + horario1.getSegundo());
    }
}