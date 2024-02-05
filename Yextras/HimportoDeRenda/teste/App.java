package Yextras.HimportoDeRenda.teste;

import Yextras.HimportoDeRenda.dominio.PessoaFisica;
import Yextras.HimportoDeRenda.dominio.PessoaJuridica;

public class App {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("Heitor", 1500, "111.222.333-44");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Jhoan", 33.560, "11022121");

        pessoaFisica.calcularImposto();
        pessoaJuridica.calcularImposto();

        System.out.println(pessoaFisica.toString());
        System.out.println(pessoaJuridica.toString());
    }
}
