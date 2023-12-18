package creating_classes.q23;

import java.util.Random;

public class Team {
    Random rand = new Random();
    private String name;
    private int win;
    private int loss;
    private int draw;
    private int points;

    public Team(String name, int win, int loss, int draw, int points) {
        this.name = name;
        this.win = win;
        this.loss = loss;
        this.draw = draw;
        this.points = points;
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
        }
    }

    public String getName() {
        return name;
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
