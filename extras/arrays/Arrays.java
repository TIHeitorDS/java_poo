package extras.arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] notas = new int[3];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Informe %dª do aluno: ", i + 1);
            notas[i] = input.nextInt();
        }

        // exibindo as notas do aluno
        System.out.print("Notas do aluno: ");
        for (int nota : notas) {
            System.out.printf("%d ", nota);
        }

        // exibindo a média parcial do aluno
        System.out.println("média parcinal do aluno: " + getAvarege(notas));

        // mudando a terceira nota do aluno
        System.out.println("nota antes da mudança: " + notas[2]);
        setNota(notas[2]);
        System.out.println("nota depois da mudança: " + notas[2]);

        input.close();
    }

    public static double getAvarege(int[] notas) {
        int total = 0;

        for (int nota : notas) {
            total += nota;
        }

        return (double) total / notas.length;
    }

    public static void setNota(int nota) {
        nota += 9;

        System.out.println("valor alterado para " + nota);
    }
}
