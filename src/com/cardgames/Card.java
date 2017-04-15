package com.cardgames;

/**
 * Created by Master on 4/7/2017.
 */
public class Card {
    private final Suit suit;
    private final Rank rank;

    Card(Suit s, Rank r){
        this.suit = s;
        this.rank = r;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public String toString(){
        return rank.getDisplayString() + " of " + suit.getDisplayString();
    }

    public static void main(String args[]){
        Card jH = new Card(Suit.HEARTS, Rank.JACK);
        Card qS = new Card(Suit.SPADES, Rank.QUEEN);
        Card kD = new Card(Suit.DIAMONDS, Rank.KING);
        Card aC = new Card(Suit.CLUBS, Rank.ACE);

        System.out.println("My cards: " + jH + ", "
                                        + qS + ", "
                                        + kD + ", "
                                        + aC);
    }
}

enum Suit {SPADES("spades"), HEARTS("hearts"), DIAMONDS("diamonds"), CLUBS("clubs");


    private final String displayString;

    Suit(String s) {
        displayString = s;
    }

    public String getDisplayString() {
        return displayString;
    }
}

enum Rank {ACE(1,"Ace"), TWO(2,"two"), THREE(3,"three"), FOUR(4,"four"), FIVE(5,"five"), SIX(6,"six"),
    SEVEN(7,"seven"), EIGHT(8,"eight"), NINE(9,"nine"), TEN(10,"ten"), JACK(10,"jack"), QUEEN(10,"queen"),
    KING(10,"king");


    private final int value;
    private final String displayString;

    Rank(int value, String displayString) {
        this.value = value;
        this.displayString = displayString;
    }

    public int getValue() {
        return value;
    }

    public String getDisplayString() {
        return displayString;
    }
}