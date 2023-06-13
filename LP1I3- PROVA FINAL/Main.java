/**
 * LP1I3- PROVA FINAL
 * @author Ivaldo Fernandes Barros Neto -  CB3020878
 *
 */

class Main {
    public static void main (String[] args) {
        ConsultaAgendada p1 = new ConsultaAgendada(10, 15, 30, 26, 6, 2023, "Ivaldo", "Luiz");

        System.out.println("----------------------------");
        System.out.println(p1.getData());
        System.out.println(p1.getHora());
        System.out.println(p1.getNomePaciente());
        System.out.println(p1.getNomeMedico());
        System.out.println("----------------------------");

        ConsultaAgendada p2 = new ConsultaAgendada();

        System.out.println(p2.getData());
        System.out.println(p2.getHora());
        System.out.println("Paciente: " + p2.getNomePaciente());
        System.out.println("Médico: " + p2.getNomeMedico());

        System.out.println("----------------------------");
        p1.setData();
        System.out.println("----------------------------");
        p1.setHora();
        System.out.println("----------------------------");
        p1.setNomeMedico();
        System.out.println("----------------------------");
        p1.setNomePaciente();
        System.out.println("----------------------------");

        System.out.println(p1.getData());
        System.out.println(p1.getHora());
        System.out.println("Paciente: " + p1.getNomePaciente());
        System.out.println("Médico: " + p1.getNomeMedico());

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Total de consultas:  " + ConsultaAgendada.getAmostra());
    }
}