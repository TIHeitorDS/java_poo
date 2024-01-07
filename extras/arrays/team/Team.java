package extras.arrays.team;

public class Team {
    private Player[] teamPlayers;
    private static final int NUMBER_OF_PLAYERS = 11;
    private int currentPlayer;

    public Team() {
        String names[] = { "Sotorres", "Balde", "Kondé", "Araujo", "Cancelo", "Roberto", "Gundogan", "De Jong",
                "Torres", "Lewandowski", "Raphinha" };
        int numbers[] = { 13, 3, 23, 4, 2, 20, 22, 21, 7, 9, 11 };

        currentPlayer = 0;

        teamPlayers = new Player[NUMBER_OF_PLAYERS];

        for (int i = 0; i < teamPlayers.length; i++) {
            teamPlayers[i] = new Player(names[i], numbers[i]);
        }
    }

    public Player dealTeam() {
        if (currentPlayer < teamPlayers.length) {
            return teamPlayers[currentPlayer++];
        } else {
            return null;
        }
    }
}