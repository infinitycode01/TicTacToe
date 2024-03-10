package com.infinity;

import java.util.ArrayList;

public class Player {
    private String name;
    private char pieceType;
    private boolean isWinner = false;
    private ArrayList<Integer> playerPositions = new ArrayList<>();

    public Player() { }

    public Player(String name, char pieceType) {
        this.name = name;
        this.pieceType = pieceType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPieceType(char pieceType) {
        this.pieceType = pieceType;
    }

    public char getPieceType() {
        return this.pieceType;
    }

    public void setWinner(boolean b) {
        this.isWinner = b;
    }

    public boolean getWinner() {
        return this.isWinner;
    }

    public ArrayList<Integer> getPlayerPositions() {
        return this.playerPositions;
    }

    public void addPosition(int position) {
        playerPositions.addLast(position);
    }

    @Override
    public String toString() {
        return "Welcome " + this.name + " your type is " + this.pieceType;
    }
}
