package Yextras.arrays.poker;

import java.security.SecureRandom;

public class DeckOfCards {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom randomNumber = new SecureRandom();

    public DeckOfCards() {
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
                "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        currentCard = 0;
        deck = new Card[NUMBER_OF_CARDS];

        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(faces[i % 13], suits[i / 13]);
        }
    }

    public void shuffle() {
        currentCard = 0;

        for (int i = 0; i < deck.length; i++) {
            int second = randomNumber.nextInt(NUMBER_OF_CARDS);

            Card temp = deck[i];
            deck[i] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard() {
        if (currentCard < deck.length) {
            return deck[currentCard++];
        } else {
            return null;
        }
    }
}
