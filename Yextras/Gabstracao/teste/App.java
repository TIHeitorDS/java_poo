package Yextras.Gabstracao.teste;

import Yextras.Gabstracao.dominio.Desenvolvedor;
import Yextras.Gabstracao.dominio.Engenheiro;

public class App {
    public static void main(String[] args) {
        Desenvolvedor funcionario = new Desenvolvedor("Guts", 1560);
        Engenheiro funcionario2 = new Engenheiro("Caska", 4500);

        System.out.println(funcionario.toString());
        System.out.println(funcionario2.toString());
    }
}
