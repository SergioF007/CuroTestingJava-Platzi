package com.testing.javatests.player;

public class Player {

    public Dice dice;
    private int minNumberToWin;

    public Player(Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberToWin = minNumberToWin;
    }

    public boolean play() {

        int diceNumber = dice.roll();
        return diceNumber > minNumberToWin;
    }
}
