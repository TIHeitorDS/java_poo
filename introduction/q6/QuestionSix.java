// Programa que recebe um valor inteiro representando um intervalo em minutos e imprime o equivalente a esse período 
// expresso em valores inteiros para dias, horas e minutos

import java.util.Scanner;

public class QuestionSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int interval;
        int days = 0, hours = 0, minutes = 0;

        System.out.print("Informe um intervalo em minutos: ");
        interval = input.nextInt();

        for (int i = 0; i < interval; i++) {
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours++;
                if (hours == 24) {
                    hours = 0;
                    days++;
                }
            }
        }

        System.out.printf("%d minutos = %d dias %d horas %d minutos\n", interval, days, hours, minutes);

        input.close();
    }
}
