package creating_classes.q23;

import java.util.Scanner;

public class TeamTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Team teamOne = new Team();

        String name;
        boolean option = true;

        // recebendo informações do time
        System.out.print("Informe o nome do time: ");
        name = input.nextLine();

        teamOne.setTeam(name);

        do {
            teamOne.play();

            System.out.print("Deseja iniciar outra partida? [S/n]: ");
            if(input.nextLine().equals("n")) {
                option = false;
            }

        } while (option);

        System.out.printf(
            "\nTime: %s ---> vitórias: %d\tderrotas: %d\tempates: %d\tpontos: %d\n",
            name, teamOne.getWin(), teamOne.getLoss(), teamOne.getDraw(), teamOne.getPoints()
        );

        input.close();
    }
}
