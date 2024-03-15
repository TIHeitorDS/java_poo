package DreuseClass.q42.dominio;

public class Administrativo extends Assistente {
    private String turno;
    private double adicional;

    public Administrativo(String nome, double salario, int matricula, String turno, double adicional) {
        super(nome, salario, matricula);
        this.turno = turno;

        if (adicional < 0) {
            this.adicional = 0.0;
        } else {
            this.adicional = adicional;
        }
    }

    @Override
    public double ganhoAnual() {
        int mesesTrabalhados = 12;
        double salarioAnual;

        salarioAnual = super.salario * mesesTrabalhados;
        if (turno.equals("noturno")) {
            return salarioAnual += (this.salario / 12 * mesesTrabalhados);
        }

        return salarioAnual += (this.salario / 12 * mesesTrabalhados) + adicional;
    }

    @Override
    public String toString() {
        return super.toString() + ", turno: " + turno + ", adicional: " + adicional;
    }

}
