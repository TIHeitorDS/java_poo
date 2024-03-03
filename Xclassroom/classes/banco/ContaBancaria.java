package Xclassroom.classes.banco;

public class ContaBancaria {
    private String nomeCorrentista;
    private double saldo;
    private boolean especial;

    ContaBancaria(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0;
        this.especial = false;
    }

    ContaBancaria(String nomeCorrentista, double saldo, boolean especial) {
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
        this.especial = especial;
    }

    public String toString() {
        return "Correntista = " + nomeCorrentista + ", saldo = " + saldo + ", é especial = " + (especial ? "sim" : "não");
    }
}
