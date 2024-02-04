package Yextras.EcontaBancaria.teste;

import Yextras.EcontaBancaria.dominio.ContaBancaria;
import Yextras.EcontaBancaria.dominio.ContaEspecial;
import Yextras.EcontaBancaria.dominio.ContaPoupanca;

public class App {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNomeCliente("Heitor");
        contaBancaria.setNumConta(010203);

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        ContaEspecial contaEspecial = new ContaEspecial();

        contaBancaria.sacar(10.40);
        contaPoupanca.sacar(140.77);
        contaEspecial.sacar(55);

        contaPoupanca.depositar(700);
        contaPoupanca.setDiaRendimento(3);
        System.out.println("------------------------");

        if(contaPoupanca.calcularNovoSaldo(0.025)) {
            System.out.println("Novo saldo na conta poupança: R$" + contaPoupanca.getSaldo());
        } else {
            System.out.println("O seu dinheiro não rendeu este mês!");
        }
        System.out.println("------------------------");

        contaBancaria.depositar(contaPoupanca.getSaldo());
        System.out.println("Valor na conta bancária: R$" + contaBancaria.getSaldo());
        contaBancaria.sacar(250.39);
        System.out.println("Saldo atual na conta bancária: " + contaBancaria.getSaldo());
        System.out.println("Saldo na conta poupança: R$" + contaPoupanca.getSaldo());
        System.out.println("------------------------");

        contaEspecial.setSaldo(1750);
        contaEspecial.setLimite(1500);
        System.out.println("Limite na conta especial: R$" + contaEspecial.getLimite());
        System.out.println("Saldo atual na conta especial: R$" + contaEspecial.getSaldo());
        contaEspecial.sacar(2500);
        System.out.println("Saldo atual na conta especial: R$" + contaEspecial.getSaldo());
    }
}
