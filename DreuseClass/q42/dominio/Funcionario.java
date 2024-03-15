package DreuseClass.q42.dominio;

public class Funcionario {
    private String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double aumento) {
        salario += aumento;
    }

    public double ganhoAnual() {
        int mesesTrabalhados = 12;
        double salarioAnual;

        salarioAnual = this.salario * 12;
        salarioAnual += this.salario / 12 * mesesTrabalhados;

        return salarioAnual;
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", salario: " + salario;
    }

}
