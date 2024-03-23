package DreuseClass.q42.dominio;

public class Administrativo extends Assistente {
    private boolean turno;
    private double adicional;

    public Administrativo(String nome, double salario, int matricula, boolean turno) {
        super(nome, salario, matricula);
        this.turno = turno;

        this.adicional = turno ? 0 : salario * 0.2;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + (12 * this.adicional);
    }

    @Override
    public String toString() {
        return super.toString() + ", turno: " + turno + ", adicional: " + adicional;
    }

}
