package com.thinkful.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    public List<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        this.getCards().add(card);
    }

    public int getValue() {
        int total = 0;
        for (Card card: this.getCards()) {
            total += card.getValue();
        }
        return total;
    }
}
