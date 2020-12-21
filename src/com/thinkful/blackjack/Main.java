package com.thinkful.blackjack;

public class Main {
    public static void main(String[] args) {

        // try the no-argument constructor
        Card aceSpades = new Card();
        System.out.println(aceSpades);

        // Try the 2 argument constructor
        Card sevenSpades = new Card("7", Suit.SPADES);
        Card jackClubs = new Card("Jack", Suit.CLUBS);

        System.out.println(sevenSpades);
        System.out.println(jackClubs);

        // try the 4 argument constructor
        Card eightHearts = new Card("8", Suit.HEARTS, 8, false);
        Card tenClubs = new Card("10", Suit.CLUBS, 10, true);
        System.out.println(eightHearts);

        // print the ten of clubs
        System.out.println(tenClubs);
        tenClubs.setTurnedUp(false); //turn over the ten of clubs
        System.out.println(tenClubs);
        tenClubs.setValue(11); // give this card more value
        System.out.println(tenClubs);


    }
}