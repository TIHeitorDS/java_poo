// Cria e manipula um objeto Account
package account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();

        System.out.println(myAccount.getName());

        String name;

        System.out.print("Please enter a name: ");
        name = input.nextLine();

        myAccount.setName(name);

        System.out.printf("name in object Account is: %s\n", myAccount.getName());

        input.close();
    }
}
