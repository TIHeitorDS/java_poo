// Escreva um programa que, dado o número de um dia do mês de fevereiro de 2015 (um valor entre 1 e 28), 
// imprime o dia da semana correspondente

package introduction.q12;

import java.util.Scanner;

public class QuestionTwelve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int day;
        String mensage;

        System.out.print("Informe um dia do mês de fevereiro: ");
        day = input.nextInt();

        mensage = "O dia " + day + " será um(a)";

        switch (day % 7) {
            case 0:
                System.out.println(mensage + " sábado.");
                break;
            case 1:
                System.out.println(mensage + " domingo.");
                break;
            case 2:
                System.out.println(mensage + " segunda-feira.");
                break;
            case 3:
                System.out.println(mensage + " terça-feira.");
                break;
            case 4:
                System.out.println(mensage + " quarta-feira.");
                break;
            case 5:
                System.out.println(mensage + " quinta-feira.");
                break;
            case 6:
                System.out.println(mensage + " sexta-feira.");
                break;
            default:
                System.out.println("Dia inválido!");
                break;
        }

        input.close();
    }
}
