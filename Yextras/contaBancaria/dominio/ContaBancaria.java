package Yextras.contaBancaria.dominio;

public class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    protected double saldo;

    public void sacar(double sacarValor) {
        if (saldo > 0) {
            saldo -= sacarValor;
            System.out.println("Valor sacado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(double depositarValor) {
        saldo += depositarValor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
