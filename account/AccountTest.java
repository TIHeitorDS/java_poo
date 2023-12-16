// Cria e manipula um objeto Account
package account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account1 = new Account("Heitor Claudino Dantas", 450);
        Account account2 = new Account("Henzo G Claudino Dantas", -7.15);

        double depositAmount;

        // exibindo o saldo inicial
        System.out.printf("%s balance: %f\n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %f\n", account2.getName(), account2.getBalance());

        // solicitando o valor do deposito para a conta um
        System.out.print("Enter deposit amount for account1: ");
        depositAmount = input.nextDouble();
        account1.deposit(depositAmount);

        // exibindo o novo saldo
        System.out.printf("\n%s balance: %f", account1.getName(), account1.getBalance());
        System.out.printf("\n%s balance: %f\n", account2.getName(), account2.getBalance());

        // solicitando o valor do deposito para a conta dois
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        account2.deposit(depositAmount);
        
        // exibindo o novo saldo
        System.out.printf("\n%s balance: %f", account1.getName(), account1.getBalance());
        System.out.printf("\n%s balance: %f\n", account2.getName(), account2.getBalance());

        input.close();
    }
}
