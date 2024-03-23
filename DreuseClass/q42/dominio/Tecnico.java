package DreuseClass.q42.dominio;

public class Tecnico extends Assistente {
    private double bonusSalarial;

    public Tecnico(String nome, double salario, int matricula, double bonusSalarial) {
        super(nome, salario, matricula);
        if (bonusSalarial < 0) {
            this.bonusSalarial = 0;
        } else {
            this.bonusSalarial = bonusSalarial;
        }
    }

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() * (1 + bonusSalarial);
    }

    @Override
    public String toString() {
        return super.toString() + ", bonus salarial: " + bonusSalarial;
    }

}
