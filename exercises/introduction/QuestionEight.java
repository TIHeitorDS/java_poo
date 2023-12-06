package exercises.introduction;

import java.util.Scanner;

public class QuestionEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int eletros = 222, cama = 111;
        int code;
        double price, finalValue;

        System.out.print("Informe o código do setor: ");
        code = input.nextInt();

        System.out.print("Informe o preço do produto: ");
        price = input.nextDouble();

        switch(code) {
            case eletros:
                if (price > 500) {
                    finalValue = price - (price * (0.1));
                } else {
                    finalValue = price;
                }

                System.err.printf("\nNome do setor: Eletros\nValor do produto com desconto: R$%.2f.\n", finalValue);
                break;
            case cama:
                if (price > 100) {
                    finalValue = price - (price * (0.4));
                } else if (price >= 50 && price <= 100) {
                    finalValue = price - (price * (0.2));
                } else {
                    finalValue = price - (price * (0.1));
                }

                System.err.printf("\nNome do setor: Cama\nValor do produto com desconto: R$%.2f\n.", finalValue);
                break;
            default:
                System.err.println("Setor inválido.");
        }

        input.close();
    }
}
