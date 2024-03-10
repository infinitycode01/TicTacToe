package com.infinity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
    private ArrayList<Character> gameBoard = new ArrayList<>();

    public Board() {
        for (int i = 0; i < 9; i++) {
            gameBoard.addLast(' ');
        }
    }

    public void placePiece(Player player, int position) {
        if (position < 1 || position > 9) return;
        else {
            gameBoard.remove(position - 1);
            gameBoard.add(position - 1, player.getPieceType());
            player.addPosition(position);
        }
    }

    public void printBoard() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < gameBoard.size(); i++) {
            if (gameBoard.get(i) == null)
                stringBuilder.append(' ');
            else
                stringBuilder.append(gameBoard.get(i));
            if ((i + 1) % 3 == 0)
                stringBuilder.append('\n');
            else
                stringBuilder.append('|');
        }
        System.out.println(stringBuilder);
    }

    public void checkWinner(Player player1, Player player2) {
        List<List<Integer>> winningConditions = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9),
                Arrays.asList(1, 4, 7),
                Arrays.asList(2, 5, 8),
                Arrays.asList(3, 6, 9),
                Arrays.asList(1, 5, 9),
                Arrays.asList(3, 5, 7)
        );

        for (List<Integer> condition : winningConditions) {
            if (player1.getPlayerPositions().containsAll(condition)) {
                System.out.println(player1.getName() + " WIN!");
                player1.setWinner(true);
                return;
            } else if (player2.getPlayerPositions().containsAll(condition)) {
                System.out.println(player2.getName() + " WIN!");
                player2.setWinner(true);
                return;
            }
        }
    }

}
