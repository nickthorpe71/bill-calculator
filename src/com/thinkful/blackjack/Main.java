package com.thinkful.blackjack;

public class Main {
    public static void main(String[] args) {

        // try the no-argument constructor
        Card aceSpades = new Card();
        System.out.println(aceSpades);

        // Try the 2 argument constructor
        Card sevenSpades = new Card(Face.SEVEN, Suit.SPADES);
        Card jackClubs = new Card(Face.JACK, Suit.CLUBS);

        System.out.println(sevenSpades);
        System.out.println(jackClubs);

        // try the 4 argument constructor
        Card eightHearts = new Card(Face.EIGHT, Suit.HEARTS, 8, false);
        Card tenClubs = new Card(Face.TEN, Suit.CLUBS, 10, true);

        System.out.println(eightHearts);

        // print the ten of clubs
        System.out.println(tenClubs);
        tenClubs.setTurnedUp(false); //turn over the ten of clubs
        System.out.println(tenClubs);
        tenClubs.setValue(11); // give this card more value
        System.out.println(tenClubs);

    }
}