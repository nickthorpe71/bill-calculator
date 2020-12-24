package com.thinkful.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;
    private HandStatus status;

    public Hand() {
        this.cards = new ArrayList<Card>();
        setStatus(HandStatus.OPEN);
    }

    public List<Card> getCards() {
        return cards;
    }

    public HandStatus getStatus() {
        return status;
    }

    public void setStatus(HandStatus status) {
        this.status = status;
    }

    public void addCard(Card card) {
        this.getCards().add(card);
        if(getValue() > 21) setStatus(HandStatus.BUST);
    }

    public int getValue() {
        int total = 0;
        for (Card card: this.getCards()) {
            total += card.getValue();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("[");
        for (Card card: this.getCards())
            stringBuilder.append(String.format("%s", card));

        if (this.getCards().size() > 0)
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        stringBuilder.append("]");

        return String.format("Value=%d, %s", this.getValue(), stringBuilder.toString());
    }
}
