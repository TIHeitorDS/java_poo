// Aplicativo para criar uma lista de clientes
package arraysAndArrayLists.q35;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cliente cliente; // cria referência a um objeto Cliente
        
        int id = 0;
        String nome;
        String telefone;
        int idade;

        ArrayList<Cliente> clientes = new ArrayList<>(); // array para armazenar uma lista de cliente

        // preenchendo os atributos do cliente
        while (id >= 0) {
            System.out.print("Informe o id do cliente: ");
            id = Integer.parseInt(input.nextLine());

            if (id < 0) {
                break;
            }

            System.out.print("Informe o nome do cliente: ");
            nome = input.nextLine();

            System.out.print("Informe a idade do cliente: ");
            idade = Integer.parseInt(input.nextLine());

            System.out.print("Informe o número de telefone do cliente: ");
            telefone = input.nextLine();

            cliente = new Cliente(id, nome, idade, telefone); // declara uma instância da classe Cliente
            clientes.add(cliente); // adiciona cliente ao array cliente
        }

        for (Cliente item : clientes) {
            System.out.println(item.toString());
        }

        input.close();
    }
}
