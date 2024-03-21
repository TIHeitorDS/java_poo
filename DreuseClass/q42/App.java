package DreuseClass.q42;

import DreuseClass.q42.dominio.Administrativo;
import DreuseClass.q42.dominio.Assistente;
import DreuseClass.q42.dominio.Funcionario;

public class App {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Douglas", 2300);
        Administrativo administrativo = new Administrativo("Kleber", 1569, 233332, true, 150.65);
        Assistente assistente = new Assistente("Heitor", 700, 121212);

        System.out.println(assistente);
        System.out.println("Ganho anual de Heitor: R$" + assistente.ganhoAnual());
        System.out.println(administrativo);
        System.out.println("Ganho anual de Kleber: R$" + administrativo.ganhoAnual());
        System.out.println(funcionario);

    }
}
