package Yextras.contaBancaria.dominio;

public class ContaEspecial extends ContaBancaria {
    private double limite;
    
    @Override
    public void sacar(double sacarValor) {
        double saldoComLimite = this.saldo + limite;
        if ((saldoComLimite - sacarValor) >= 0) {
            this.saldo -= sacarValor;
            System.out.println("Valor sacado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    } 
}
