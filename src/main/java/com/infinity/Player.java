package com.infinity;

import java.util.ArrayList;

public class Player {
    private String name;
    private char pieceType;
    private ArrayList<Integer> playerPositions = new ArrayList<>();

    public Player() {
        this.name = "Player";
        this.pieceType = 'O';
    }

    public Player(String name, char pieceType) {
        this.name = name;
        this.pieceType = pieceType;
    }

    public String getName() {
        return this.name;
    }

    public char getPieceType() {
        return this.pieceType;
    }

    public ArrayList<Integer> getPlayerPositions() {
        return this.playerPositions;
    }

    public void addPosition(int position) {
        playerPositions.addLast(position);
    }
}
