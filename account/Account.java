// Classe que contém uma variável de instância name
// e métodos para atribuir e obter seu valor
package account;

public class Account {
    private String name; // variável de instância
    private double balance; // variável de inst^ncia

    // construtor que aceita dois parâmetros
    public Account(String name, double balance) { // o nome do construtor é o nome da classe 
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    // método para depositar uma quantia válida
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }

    // método para exibir o saldo da conta
    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
