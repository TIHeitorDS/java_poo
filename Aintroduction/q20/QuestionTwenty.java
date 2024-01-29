// Crie uma função recursiva mdc que retorna o máximo divisor comum de m e n

package Aintroduction.q20;

import java.util.Scanner;

public class QuestionTwenty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m, n, result;

        System.out.print("Informe o primeiro número: ");
        m = input.nextInt();

        System.out.print("Informe o segundo número: ");
        n = input.nextInt();

        result = mdc(m, n);

        System.out.println("mdc = " + result);

        input.close();
    }

    public static int mdc(int m, int n) {
        if (n > m) {
            return mdc(n, m);
        } else if (n == 0) {
            return m;
        } else {
            return mdc(n, m%n);
        }
    }

}
