import java.util.Scanner;
import java.text.*;
import java.util.*;

class Data {
    private int dia, mes, ano;

    public int QtDiaMes = 31, AnoBi = 0, BlockMes = 3;
    public Scanner teclado = new Scanner(System.in);

    Data() {
        setDia();
        setMes();
        setAno();
    }

    Data (int d, int m, int a) {
        dia = d;
        mes = m;
        ano = a;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes (int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDia() {

        boolean chave = false;
        do {
            System.out.println("Digite o dia: ");
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

    public void setMes () {
        boolean chave = false;
        do {
            System.out.println("Digite o mês: ");
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

    public void setAno() {
        boolean chave = false;
        do {
            System.out.println("Digite o ano: ");
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

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
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
                mostradata += "Janeiro/";
                break;
            case 2:
                mostradata += "Fevereiro/";
                break;
            case 3:
                mostradata += "Março/";
                break;
            case 4:
                mostradata += "Abril/";
                break;
            case 5:
                mostradata += "Maio/";
                break;
            case 6:
                mostradata += "Junho/";
                break;
            case 7:
                mostradata += "Julho/";
                break;
            case 8:
                mostradata += "Agosto/";
                break;
            case 9:
                mostradata += "Setembro/";
                break;
            case 10:
                mostradata += "Outubro/";
                break;
            case 11:
                mostradata += "Novembro/";
                break;
            case 12:
                mostradata += "Dezembro/";
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
            System.out.println("É necessário selecionar dia, mês e ano primeiro!");
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

class Hora {
    private int hora, minuto, segundo;
    public Scanner teclado = new Scanner(System.in);

    Hora() {
        set_hora();
        set_minuto();
        set_segundo();
    }

    Hora(int h, int m, int s) {
        set_hora(h);
        set_minuto(m);
        set_segundo(s);
    }

    public void set_hora() {
        do {
            System.out.println("Digite as horas: ");
            hora = teclado.nextInt();

            if (hora < 0 || hora > 23) {
                System.out.println("Valor inválido!");
            }
        }
        while(hora < 0 || hora > 23);

    }

    public void set_hora(int h) {
        if (h< 0 || h > 23) {
            System.out.println("Valor inválido! Colocando 0!");
            hora = 0;
        }
        else {
            hora = h;
        }
    }

    public void set_minuto() {
        do {
            System.out.println("Digite os minutos: ");
            minuto = teclado.nextInt();

            if (minuto < 0 ||minuto > 59) {
                System.out.println("Valor inválido!");
            }
        }
        while(minuto < 0 ||minuto > 59);

    }

    public void set_minuto(int m) {
        if (m< 0 || m > 59) {
            System.out.println("Valor inválido! Colocando 0!");
            minuto = 0;
        }
        else {
            minuto = m;
        }
    }

    public void set_segundo() {
        do {
            System.out.println("Digite os segundos: ");
            segundo = teclado.nextInt();

            if (segundo < 0 || segundo > 59) {
                System.out.println("Valor inválido!");
            }
        }
        while(segundo < 0 || segundo > 59);

    }

    public void set_segundo(int s) {
        if (s< 0 || s > 59) {
            System.out.println("Valor inválido! Colocando 0!");
            segundo = 0;
        }
        else {
            segundo = s;
        }
    }

    public String mostraHora() {
        String x = "";

        if (hora < 10) {
            x += "0" + hora + ":";
        }
        else {
            x += hora + ":";
        }

        if (minuto < 10) {
            x += "0" + minuto + ":";
        }
        else {
            x += minuto + ":";
        }

        if (segundo < 10) {
            x += "0" + segundo;
        }
        else {
            x += segundo;
        }

        return x;
    }
};

class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente, nomeMedico;
    private static int quantidade = 0;

    public Scanner teclado = new Scanner(System.in);

    ConsultaAgendada() {
        data = new Data();
        System.out.println("----------------------------");
        hora = new Hora();
        System.out.println("----------------------------");
        setNomePaciente();
        System.out.println("----------------------------");
        setNomeMedico();
        System.out.println("----------------------------");

        ++quantidade;
    }

    ConsultaAgendada (int h, int mi, int s, int d, int me, int a, String p, String m) {
        hora = new Hora(h, mi, s);

        data = new Data(d, me, a);

        setNomePaciente(p);
        setNomeMedico(m);

        ++quantidade;
    }

    ConsultaAgendada (Data d, Hora h, String p, String m) {
        data = d;
        hora = h;

        setNomePaciente(p);
        setNomeMedico(m);

        ++quantidade;
    }

    public void setNomePaciente() {
        System.out.println("Digite o nome do paciente: ");
        nomePaciente = teclado.next();
    }

    public void setNomePaciente(String p) {
        nomePaciente = p;
    }

    public void setNomeMedico() {
        System.out.println("Digite o nome do medico: ");
        nomeMedico = teclado.next();
    }

    public void setNomeMedico(String m) {
        nomeMedico = m;
    }

    public void setHora() {
        hora.set_hora();
        hora.set_minuto();
        hora.set_segundo();
    }

    public void setHora(int h, int m, int s) {
        hora.set_hora(h);
        hora.set_minuto(m);
        hora.set_segundo(s);
    }

    public void setData() {
        data.setDia();
        data.setMes();
        data.setAno();
    }

    public void setData(int d, int m, int a) {
        data.setDia(d);
        data.setMes(m);
        data.setAno(a);
    }

    public String getData() {
        return data.mostra1();
    }

    public String getHora() {
        return hora.mostraHora();
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public static int getAmostra() {
        return quantidade;
    }
};

