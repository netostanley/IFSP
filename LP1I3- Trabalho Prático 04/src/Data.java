import java.util.Scanner;
import java.text.*;
import java.util.*;

class Data {
    private int dia, mes, ano;

    // QtDiaMes -> para saber quantos dias tem o mês escolhido
    // AnoBi -> Caso 0: não foi declarado o ano;
    //          Caso 1: ano foi escolhido é bissexto;
    //          Caso 2: ano escolhido não é bissexto;
    // BlockMes -> para bloquear digitação de meses com menos
    //		   dias do que o dia escolhido.

    public int QtDiaMes = 31, AnoBi = 0, BlockMes = 3;
    public Scanner teclado = new Scanner(System.in);

    Data() {
        entraDia();
        entraMes();
        entraAno();
    }

    Data (int d, int m, int a) {
        dia = d;
        mes = m;
        ano = a;
    }

    public void entraDia(int d) {
        dia = d;
    }

    public void entraMes (int m) {
        mes = m;
    }

    public void entraAno(int a) {
        ano = a;
    }

    public void entraDia() {

        boolean chave = false;
        do {
            System.out.println("Digite o dia desejado: ");
            dia = teclado.nextInt();

            if (dia > 31 || dia < 1) {
                System.out.println("Data inválida!");
            }
            else if (dia > QtDiaMes) {
                System.out.println("Data inválida! Dias demais para o mês!");
            }
            else {
                chave = true;
                switch (dia) {
                    case 31:
                        BlockMes = 0;
                        break;

                    case 30:
                        BlockMes = 1;
                        break;

                    case 29:
                        BlockMes = 2;
                        break;

                    default:
                        BlockMes = 3;
                        break;
                }
            }
        }
        while(chave == false);
    }

    public void entraMes () {
        boolean chave = false;
        do {
            System.out.println("Digite o mês desejado: ");
            mes = teclado.nextInt();

            if (mes <= 0 || mes > 12) {
                System.out.println("Digite um mês entre 1 e 12!");
            }
            else if (BlockMes == 0) {
                if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    chave = false;
                    System.out.println("Digite um mês que tenha 31 dias!");
                }
                else {
                    chave = true;
                }
            }
            else if (BlockMes == 1 && mes == 2) {
                System.out.println("Digite um mês que tenha 30 dias!");
            }
            else if (BlockMes == 2) {
                if (mes == 2) {
                    if (AnoBi == 0 || AnoBi == 1) {
                        QtDiaMes = 29;
                        chave = true;
                    }
                    if (AnoBi != 0 && AnoBi != 1) {
                        System.out.println("Digite um mês que tenha 29 dias!");
                    } }
                else {
                    chave = true;
                }
            }
            else if (BlockMes == 3) {
                chave = true;
                switch (mes) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        QtDiaMes = 31;
                        break;

                    case 4: case 6: case 9: case 11:
                        QtDiaMes = 30;
                        break;

                    case 2:
                        if (AnoBi == 0) {
                            QtDiaMes = 0;
                        }
                        else if (AnoBi == 1) {
                            QtDiaMes = 29;
                        }
                        else {
                            QtDiaMes = 28;
                        }
                        break;
                }
            }
        }
        while(chave == false);
    }

    public void entraAno() {
        boolean chave = false;
        do {
            System.out.println("Digite o ano desejado: ");
            ano = teclado.nextInt();

            if (ano < 0 || ano > 9999) {
                System.out.println("Digite um ano entre 0 e 9999!");
            }
            else if (dia == 29 && mes == 2) {
                if (ano % 4 != 0) {
                    System.out.println("Digite um ano bissexto");
                }
                else {
                    AnoBi = 1;
                    chave = true;
                }
            }
            else {
                chave = true;
                if (ano % 4 == 0) {
                    AnoBi = 1;
                }
                else {
                    AnoBi = 2;
                }
            }
        }
        while(chave == false);
    }

    public int retDia() {
        return dia;
    }

    public int retMes() {
        return mes;
    }

    public int retAno() {
        return ano;
    }

    public String mostra1() {
        String mostradata = "";

        if(dia < 10) {
            mostradata += "0" + dia + "/";
        }
        else {
            mostradata += dia + "/";
        }
        if(mes < 10) {
            mostradata += "0" + mes + "/";
        }
        else {
            mostradata += mes + "/";
        }
        if(ano < 10) {
            mostradata += "000" + ano;
        }
        else if (ano < 100) {
            mostradata += "00" + ano;
        }
        else if (ano < 1000) {
            mostradata += "0" + ano;
        }
        else {
            mostradata += ano;
        }

        return mostradata;
    }

    public String mostra2() {
        String mostradata = "";

        if(dia < 10) {
            mostradata += "0" + dia + "/";
        }
        else {
            mostradata += dia + "/";
        }
        switch (mes) {
            case 1:
                mostradata += "janeiro/";
                break;
            case 2:
                mostradata += "fevereiro/";
                break;
            case 3:
                mostradata += "março/";
                break;
            case 4:
                mostradata += "abril/";
                break;
            case 5:
                mostradata += "maio/";
                break;
            case 6:
                mostradata += "junho/";
                break;
            case 7:
                mostradata += "julho/";
                break;
            case 8:
                mostradata += "agosto/";
                break;
            case 9:
                mostradata += "setembro/";
                break;
            case 10:
                mostradata += "outubro/";
                break;
            case 11:
                mostradata += "novembro/";
                break;
            case 12:
                mostradata += "dezembro/";
                break;
        }
        if(ano < 10) {
            mostradata += "000" + ano;
        }
        else if (ano < 100) {
            mostradata += "00" + ano;
        }
        else if (ano < 1000) {
            mostradata += "0" + ano;
        }
        else {
            mostradata += ano;
        }

        return mostradata;
    }

    public boolean bissexto() {
        boolean bissexto;
        if (AnoBi == 1) {
            bissexto = true;
        }
        else {
            bissexto = false;
        }
        return bissexto;
    }

    public int diasTranscorridos() {
        int diastranscorridos = 0;
        int qtDiaMes = 0;
        if (dia == 0 || mes == 0 || ano == 0) {
            System.out.println("Há necessidade de selecionar dia, mês e ano primeiro!");
        }
        else {
            for (int i = 1; i <= mes; i++) {

                switch (i) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        qtDiaMes = 31;
                        break;

                    case 4: case 6: case 9: case 11:
                        qtDiaMes = 30;
                        break;

                    case 2:
                        if (AnoBi == 1) {
                            qtDiaMes = 29;
                        }
                        else if (AnoBi == 2) {
                            qtDiaMes = 28;
                        }
                        break;
                }

                if (i == mes) {
                    for (int j = 1; j <= dia; j++) {
                        diastranscorridos++;
                    }
                }

                else {
                    for (int j = 1; j <= qtDiaMes; j++) {
                        diastranscorridos++;
                    }
                }

            }
        }
        return diastranscorridos;
    }

    public String apresentaDataAtual() {
        DateFormat data = DateFormat.getDateInstance(DateFormat.FULL);
        return data.format(new Date());
    }
}