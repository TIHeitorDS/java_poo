package Xclassroom.Natal;

public class Natal {
    private int dia;
    private int mes;
    private int ano;

    private void inicializaData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public static Natal natal(int ano) {
        if (ano < 0) return null;

        Natal dNatal = new Natal();
        dNatal.inicializaData(25, 12, ano);

        return dNatal;
    }

    public String toString() {
        return String.format("dia: %d, mês: %d, ano: %d", dia, mes, ano);
    }
}
