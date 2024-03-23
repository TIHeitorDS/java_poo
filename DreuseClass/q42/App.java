package DreuseClass.q42;

import DreuseClass.q42.dominio.Administrativo;
import DreuseClass.q42.dominio.Assistente;
import DreuseClass.q42.dominio.Funcionario;
import DreuseClass.q42.dominio.Tecnico;

public class App {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Douglas", 2300);
        Administrativo administrativo = new Administrativo("Kleber", 1569, 233332, false);
        Assistente assistente = new Assistente("Heitor", 700, 121212);
        Tecnico tecnico = new Tecnico("Sabrina", 1102.85, 123456, 0.2);

        System.out.println(assistente);
        System.out.println("Ganho anual de Heitor: R$" + assistente.ganhoAnual());

        System.out.println(administrativo);
        System.out.println("Ganho anual de Kleber: R$" + administrativo.ganhoAnual());

        System.out.println(funcionario);
        System.out.println("Ganho anual de Douglas: R$" + funcionario.ganhoAnual());

        System.out.println(tecnico);
        tecnico.aumentarSalario(500);
        System.out.println("salário após aumento: R$" + tecnico.getSalario());
        System.out.println("Ganho anual de Sabrina: R$" +  tecnico.ganhoAnual());

    }
}
