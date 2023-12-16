package creating_classes.q23;

import java.util.Random;

public class Team {
    Random rand = new Random();
    private String name;
    private int win;
    private int loss;
    private int draw;
    private int points;

    public void setTeam(String name) {
        this.name = name;
        this.win = 0;
        this.loss = 0;
        this.draw = 0;
        this.points = 0;
    }

    public void play() {
        int goalTeamOne = rand.nextInt(5);
        int goalTeamTwo = rand.nextInt(5);

        if (goalTeamOne > goalTeamTwo) {
            System.out.printf("\nVitória do %s!\n", name);
            this.win++;
            this.points += 3;
        } else if (goalTeamOne < goalTeamTwo) {
            System.out.printf("\nDerrota do %s!\n", name);
            this.loss++;
        } else {
            System.out.println("\nEmpate!");
            this.draw++;
            this.points++;
            this.points++;
        }
    }

    public int getWin() {
        return win;
    }

    public int getLoss() {
        return loss;
    }

    public int getDraw() {
        return draw;
    }

    public int getPoints() {
        return points;
    }
}
