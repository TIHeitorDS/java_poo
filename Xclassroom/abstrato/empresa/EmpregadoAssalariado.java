package Xclassroom.abstrato.empresa;

public class EmpregadoAssalariado extends Empregado {
    private double salario;

    public EmpregadoAssalariado(String nome, String CTPS, double salario) {
        super(nome, CTPS);
        this.salario = salario;
    }

    public double getPagamento() {
        return salario;
    }
}
