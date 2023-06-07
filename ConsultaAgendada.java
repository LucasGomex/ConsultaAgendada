import java.util.Scanner;

public class ConsultaAgendada {
    private static int quantidade = 0;
    private float valor;

    private Data data;
    private Hora hora;
    private String nomePaciente;
    private String nomeMedico;

    private Scanner scan = new Scanner(System.in);

    public ConsultaAgendada() {
        this.setData();
        this.setHora();
        this.setNomePaciente();
        this.setNomeMedico();
        quantidade++;
    }

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String m2) {
        this.setData(d, m, a);
        this.setHora(h, mi, s);
        this.setNomePaciente(p);
        this.setNomeMedico(m2);
        quantidade++;
    }

    public ConsultaAgendada(Data d, Hora h, String p, String m) {
        this.data = d;
        this.hora = h;
        this.setNomePaciente(p);
        this.setNomeMedico(m);
        quantidade++;
    }

    public void setData(int a, int b, int c) {
        this.data = new Data(a, b, c);
    }

    public void setData() {
        this.data = new Data();
    }

    public void setHora(int a, int b, int c) {
        this.hora = new Hora(a, b, c);
    }

    public void setHora() {
        this.hora = new Hora();
    }

    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }

    public void setNomePaciente() {
        System.out.print("Entre com o nome do paciente: ");
        this.nomePaciente = scan.nextLine();
    }

    public void setNomeMedico(String m) {
        this.nomeMedico = m;
    }

    public void setNomeMedico() {
        System.out.print("Entre com o nome do médico: ");
        this.nomeMedico = scan.nextLine();
    }

    public int getAmostra() {
        return quantidade;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getData() {
        return this.data.mostra1();
    }

    public String getHora() {
        return this.hora.getHora1();
    }

    public String getNomePaciente() {
        return this.nomePaciente;
    }

    public String getNomeMedico() {
        return this.nomeMedico;
    }
}
