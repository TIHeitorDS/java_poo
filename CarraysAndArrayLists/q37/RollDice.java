package CarraysAndArrayLists.q37;

import java.security.SecureRandom;

public class RollDice {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        // criando dois objetos array para representar dados
        int[] dice1 = { 1, 2, 3, 4, 5, 6 };
        int[] dice2 = { 1, 2, 3, 4, 5, 6 };

        int[] frequencia = new int[13]; // array para contar a frequência da soma dos dados
        int soma = 0;

        for (int i = 1; i <= 36000000; i++) {
            soma = dice1[randomNumbers.nextInt(6)] + dice2[randomNumbers.nextInt(6)];

            ++frequencia[soma];
        }

        for (int j = 2; j < frequencia.length; j++) {
            System.out.printf("lado: %d, vezes somados: %d\n", j, frequencia[j]);
        }
    }
}
