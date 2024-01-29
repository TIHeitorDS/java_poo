package Yextras.arrays.poker;

public class App {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();

        deck.shuffle();
        for (int i = 1; i <= 52; i++) {
            System.out.printf("%-19s", deck.dealCard());

            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }
}
