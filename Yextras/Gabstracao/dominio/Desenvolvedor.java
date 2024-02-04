package Yextras.Gabstracao.dominio;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    public void calculaBonus() {
        this.salario = salario + salario*0.1;
    }

    @Override
    public String toString() {
        return "Desenvolvedor [nome=" + nome + ", salario=" + salario + "]";
    }
}
