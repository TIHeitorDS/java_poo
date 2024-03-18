package Eabstract.q44;

public class App {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Heitor");
        Funcionario funcionario2 = new Funcionario("Henzo", 5.50);

        funcionario1.setIdade(20);
        funcionario2.setIdade(22);

        System.out.println(funcionario1);
        System.out.println(funcionario2);

        System.out.println("salário do funcionário " + funcionario1.getNome() + ": R$" + funcionario1.salario());
        System.out.println("salário do funcionário " + funcionario2.getNome() + ": R$" + funcionario2.salario());
    }
}
