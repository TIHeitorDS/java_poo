// Programa que recebe do usuário o código do setor da loja e o valor original de um produto e 
// imprime na tela o nome do setor e o valor do produto com desconto

package Aintroduction.q08;

import java.util.Scanner;

public class QuestionEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int code;
        double price;

        System.out.print("Informe o código do setor: ");
        code = input.nextInt();
        System.out.print("Informe o preço do produto: ");
        price = input.nextDouble();
        
        input.close();

        switch(code) {
            case 222:
                System.out.println("Nome do setor: Eletros.");
                if (price > 500) {
                 price *= 0.90;
                }
                break;
            case 111:
                System.out.println("Nome do setor: Cama, Mesa, Banho.");
                if (price > 100) {
                    price *= 0.60;
                } else if (price >= 50) {
                    price *= 0.80;
                } else {
                    price *= 0.90;
                }
                break;
            default:
                System.out.println("Setor inválido.");
                return;
        }

        System.out.println("Preço do produto com desconto: " + price);
    }
}
