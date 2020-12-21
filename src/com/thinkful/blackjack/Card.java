package com.thinkful.blackjack;

public class Card {
    private Suit suit;
    private String cardFace;
    private int value;
    private boolean turnedUp;

    public Card() {
        this("Ace", Suit.SPADES, 1, false);
    }

    public Card(String cardFace, Suit suit){
        this(cardFace, suit, 1, false);
    }

    public Card(String cardFace, Suit suit, int value, boolean turnedUp){
        this.setSuit(suit);
        this.setCardFace(cardFace);
        this.setValue(value);
        this.setTurnedUp(turnedUp);
    }

    @Override
    public String toString() {
        return String.format("Card: %s of %s (Value: %d, Turned Up: %b)",
                this.getCardFace(), this.getSuit(), this.getValue(), this.isTurnedUp());
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public String getCardFace() {
        return cardFace;
    }

    public void setCardFace(String cardFace) {
        this.cardFace = cardFace;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isTurnedUp() {
        return turnedUp;
    }

    public void setTurnedUp(boolean turnedUp) {
        this.turnedUp = turnedUp;
    }
}