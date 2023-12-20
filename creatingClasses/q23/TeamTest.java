package creatingClasses.q23;

import java.util.Scanner;

public class TeamTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Team teamOne = new Team("Botafogo", 0, 0, 0, 0);

        boolean option = true;

        do {
            teamOne.play();

            System.out.print("Deseja iniciar outra partida? [S/n]: ");
            if(input.nextLine().equals("n")) {
                option = false;
            }

        } while (option);

        System.out.printf(
            "\nTime: %s\nvitórias: %d\tderrotas: %d\tempates: %d\tpontos: %d\n",
            teamOne.getName(), teamOne.getWin(), teamOne.getLoss(), teamOne.getDraw(), teamOne.getPoints()
        );

        input.close();
    }
}
