package com.thinkful.blackjack;

public class Game {

    private Hand player;
    private Hand dealer;
    private Deck deck;

    public Game() {
        setPlayer(new Hand());
        setDealer(new Hand());
        setDeck(new Deck());
        getDeck().shuffle();
        getPlayer().addCard(getDeck().deal());
        getDealer().addCard(getDeck().deal());
        getPlayer().addCard(getDeck().deal());
        getDealer().addCard(getDeck().deal());
    }

    @Override
    public String toString(){
        return String.format("Player: %s, Dealer: %s", getPlayer(), getDealer());
    }

    public void dealerMove() {
        while(getDealer().getValue() < 16 && getDealer().getStatus() == HandStatus.OPEN) {
            getDealer().addCard(getDeck().deal());
        }
        if(getDealer().getStatus() == HandStatus.OPEN) {
            getDealer().setStatus(HandStatus.STAND);
        }
    }

    public void playerMove(Action action) {
        if(action == Action.HIT) {
            getPlayer().addCard(getDeck().deal());
        } else {
            if(action == Action.STAND) {
                getPlayer().setStatus(HandStatus.STAND);
            }
        }
    }

    public boolean isPlayerTurn() {
        return getPlayer().getStatus() == HandStatus.OPEN;
    }

    public Hand getPlayer() {
        return player;
    }

    public void setPlayer(Hand player) {
        this.player = player;
    }

    public Hand getDealer() {
        return dealer;
    }

    public void setDealer(Hand dealer) {
        this.dealer = dealer;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

}
