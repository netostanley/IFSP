/**
 * LP1I3- Trabalho Prático 04
 * @author Ivaldo Fernandes Barros Neto -  CB3020878
 *
 */


public class Main {
    public static void main(String[] args) {

        Data p1 = new Data(1, 4, 3);

        p1.entraAno();
        p1.entraMes();
        p1.entraDia();
        System.out.println(p1.mostra1());
        System.out.println("É um ano bissexto? " + p1.bissexto());
        System.out.println("Já passaram " + p1.diasTranscorridos() + " dias");
        System.out.println(p1.mostra2());
        System.out.println(p1.apresentaDataAtual());
    }
}