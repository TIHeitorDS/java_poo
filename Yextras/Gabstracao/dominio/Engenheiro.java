package Yextras.Gabstracao.dominio;

public class Engenheiro extends Funcionario{
    public Engenheiro(String nome, double salario) {
        super(nome, salario);
    }

    public void calculaBonus() {
        this.salario = salario + salario*0.05;
    }

    @Override
    public String toString() {
        return "Engenheiro [nome=" + nome + ", salario=" + salario + "]";
    }
}
