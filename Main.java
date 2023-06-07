public class Main {

/**
 * @author Rodrigo Braga Guimarães Brito e Lucas Gomes dos Santos 
 */
public static void main(String[] args){
    ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 24, 23, 9, 2023, "Lucas Gomes", "Dr. Rodrigo Braga");

    System.out.println("Propriedades p1\n");
    System.out.println("Data: " + p1.getData());
    System.out.println("Hora: " + p1.getHora());
    System.out.println("Nome do paciente: " + p1.getNomePaciente());
    System.out.println("Nome do médico: " + p1.getNomeMedico());
    System.out.println("Quantidade de consultas agendadas: " + p1.getAmostra());
    System.out.println("");


    ConsultaAgendada p2 = new ConsultaAgendada();

    System.out.println("\nPropriedades p2\n");
    System.out.println("Data: " + p2.getData());
    System.out.println("Hora: " + p2.getHora());
    System.out.println("Nome do paciente: " + p2.getNomePaciente());
    System.out.println("Nome do médico: " + p2.getNomeMedico());
    System.out.println("Quantidade de consultas agendadas: " + p2.getAmostra());
    System.out.println("");

    System.out.println("Alterando valores do p1\n");

    p1.setData();
    p1.setHora();
    p1.setNomePaciente();
    p1.setNomeMedico();

    System.out.println("\nPropriedades p1\n");
    System.out.println("Data: " + p1.getData());
    System.out.println("Hora: " + p1.getHora());
    System.out.println("Nome do paciente: " + p1.getNomePaciente());
    System.out.println("Nome do médico: " + p1.getNomeMedico());
    System.out.println("Quantidade de consultas agendadas: " + p1.getAmostra());

}
}