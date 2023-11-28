import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float nota1;
        float nota2;
        float nota3;
        float media;

        System.out.print("Informa sua nota da primeira unidade: ");
        nota1 = input.nextFloat();

        System.out.print("Informa sua nota da segunda unidade: ");
        nota2 = input.nextFloat();

        System.out.print("Informa sua nota da terceira unidade: ");
        nota3 = input.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7)
            System.out.printf("Parabéns, você foi aprovado com média: %.1f!", media);
        
        if (media < 7)
            System.out.printf("Infelizmente você foi reprovado! Sua média foi: %.1f.", media);

        input.close();
    }
}
