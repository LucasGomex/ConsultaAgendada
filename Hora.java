import java.util.Scanner;
/**
 * @author Rodrigo Braga Guimaraes Brito e Lucas Gomes dos Santos 
 */
public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    private Scanner scan = new Scanner(System.in);

    public Hora() {
        this.setHora();
        this.setMinuto();
        this.setSegundo();
    }

    public Hora(int h, int m, int s) {
        this.setHora(h);
        this.setMinuto(m);
        this.setSegundo(s);
    }

    public void setHora() {
        int h;

        do {
            System.out.print("Digite a hora: ");
            h = scan.nextInt();

            if (h < 0 || h > 23) {
                System.out.println("Hora inválida! (Hora deve ser um valor entre 0 e 23)");
            }

        } while (h < 0 || h > 23);

        this.hora = h;
    }

    public void setHora(int h) {
        if (h >= 0 && h <= 23) {
            this.hora = h;
        } else {
            System.out.println("Hora inválida! (Hora deve ser um valor entre 0 e 23)");
        }
    }

    public void setMinuto() {
        int m;

        do {
            System.out.print("Digite os minutos: ");
            m = scan.nextInt();

            if (m < 0 || m > 59) {
                System.out.println("Minuto inválido! (Minuto deve ser um valor entre 0 e 59)");
            }

        } while (m < 0 || m > 59);

        this.minuto = m;
    }

    public void setMinuto(int m) {
        if (m >= 0 && m <= 59) {
            this.minuto = m;
        } else {
            System.out.println("Minuto inválido! (Minuto deve ser um valor entre 0 e 59)");
        }
    }

    public void setSegundo() {
        int s;

        do {
            System.out.print("Digite os segundos: ");
            s = scan.nextInt();

            if (s < 0 || s > 59) {
                System.out.println("Segundo inválido! (Segundo deve ser um valor entre 0 e 59)");
            }

        } while (s < 0 || s > 59);

        this.segundo = s;
    }

    public void setSegundo(int s) {
        if (s >= 0 && s <= 59) {
            this.segundo = s;
        } else {
            System.out.println("Segundo inválido! (Segundo deve ser um valor entre 0 e 59)");
        }
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public int getSegundos() {
        final int QTD_SEGUNDOS_EM_HORA = 3600;
        final int QTD_SEGUNDOS_EM_MINUTO = 60;

        int qtdSegundos = 0;

        qtdSegundos += this.hora * QTD_SEGUNDOS_EM_HORA;
        qtdSegundos += this.minuto * QTD_SEGUNDOS_EM_MINUTO;
        qtdSegundos += this.segundo;

        return qtdSegundos;
    }

    public String getHora1() {
        return formatarData(this.hora, this.minuto, this.segundo);
    }

    public String getHora2() {
        int horaPeriodo = this.hora;
        String periodo = horaPeriodo < 12 ? "AM" : "PM";

        if (horaPeriodo == 0) {
            horaPeriodo = 12;
        }

        if (horaPeriodo > 12) {
            horaPeriodo -= 12;
        }

        return formatarData(horaPeriodo, this.minuto, this.segundo) + " " + periodo;
    }

    private String formatarData(int hora, int minuto, int segundo) {
        return String.format("%02d", hora) + ":" +
                String.format("%02d", minuto) + ":" +
                String.format("%02d", segundo);
    }
}