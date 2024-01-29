// Crie uma função recursiva potencia(base,expoente) que, quando chamado, retorna base^expoente.
// Por exemplo, potencia(3,4) deve ser implementado como 3 ∗ 3 ∗ 3 ∗ 3. (A saída é apenas
// 81 nesse exemplo)

package Aintroduction.q18;

import java.util.Scanner;

public class QuestionEighteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base, expoente, pot;

        System.out.print("Informe a base: ");
        base = input.nextInt();

        System.out.print("Informe o expoente: ");
        expoente = input.nextInt();

        pot = potencia(base, expoente);
        
        System.out.println("Potência = " + pot);

        input.close();
    }

    public static int potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        } else {
            return base * potencia(base, expoente - 1);
        }
    }
}
