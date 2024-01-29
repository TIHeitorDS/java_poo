package Yextras.arrays.team;

public class App {
    public static void main(String[] args) {
        Team team = new Team();

        for (int i = 1; i <= 11; i++) {
            System.out.printf("%-19s", team.dealTeam());

            if (i == 1 || i % 4 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
