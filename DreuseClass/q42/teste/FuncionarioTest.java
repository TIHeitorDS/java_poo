package DreuseClass.q42.teste;

import DreuseClass.q42.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Heitor", 3000);

        System.out.println(funcionario.ganhoAnual());
    }
}
