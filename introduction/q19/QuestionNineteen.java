// Escreva uma função que calcule o fatorial de forma recursiva

package introduction.q19;

import java.util.Scanner;

public class QuestionNineteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        String tab = "\t";

        System.out.print("Informe um número inteiro: ");
        number = input.nextInt();

        for (int i = 0; i <= number; i++) {
            System.out.println(i + "!" + " = " + fatorial(i));
            System.out.print(tab);
            tab += "\t";
        }

        input.close();
    }

    public static int fatorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * fatorial(num - 1);
        }
    }
}
