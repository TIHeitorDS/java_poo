package exercises.introduction;

import java.util.Scanner;

public class QuestionEleven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x1, y1, x2, y2;
        String mensagem = "\nA segunda coordenada está ";

        System.out.println("Informe os valores de 'x' e 'y' da primeira cordenada");
        System.out.print("x: ");
        x1 = input.nextInt();
        System.out.print("y: ");
        y1 = input.nextInt();

        System.out.println("Informe os valores de 'x' e 'y' da segunda cordenada");
        System.out.print("x: ");
        x2 = input.nextInt();
        System.out.print("y: ");
        y2 = input.nextInt();

        if (x2 < x1) mensagem += "à esquerda e ";
        else mensagem += "à direta e ";

        if (y2 < y1) mensagem += "abaixo da primeira coordenada.";
        else mensagem += "acima da primeira coordenada.";

        System.out.println(mensagem);

        input.close();
    }
}
