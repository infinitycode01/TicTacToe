package com.infinity;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe game for 2 Players!");
        System.out.println("Press 1 for start, else exit");
        Scanner scanner = new Scanner(System.in);
        int startGame = scanner.nextInt();
        if (startGame == 1) {
            Player player1 = new Player();
            Player player2 = new Player();

            System.out.println("Input first player name");
            String name = scanner.next();
            player1.setName(name);

            System.out.println("Chose your piece type\n" + "0 for 'O' or 1 for 'X'");
            int pieceType = scanner.nextInt();

            while (pieceType != 0 && pieceType != 1) {
                System.out.println("Wrong!\n" + "0 for 'O' or 1 for 'X'");
                pieceType = scanner.nextInt();
            }

            if (pieceType == 0) {
                player1.setPieceType('O');
                System.out.println("Input second player name");
                name = scanner.next();
                player2.setName(name);
                player2.setPieceType('X');
            } else {
                player1.setPieceType('X');
                System.out.println("Input second player name");
                name = scanner.next();
                player2.setName(name);
                player2.setPieceType('O');
            }
            System.out.println("First Player\n" + player1.toString());
            System.out.println("Second Player\n" + player2.toString());

            Board board = new Board();
            board.printBoard();
            int position;
            while (true) {
                System.out.println(player1.getName() + ", write position from 1 to 9");
                position = scanner.nextInt();
                while (!(position >= 1 && position <= 9)) {
                    System.out.println("Wrong!\n" + player1.getName() + ", write position from 1 to 9");
                    position = scanner.nextInt();
                }
                board.placePiece(player1, position);
                board.printBoard();
                board.checkWinner(player1, player2);
                if (player1.getWinner()) {
                    System.out.println("OMG, " + player1.getName() + " you WON!!!");
                    return;
                }

                System.out.println(player2.getName() + ", write position from 1 to 9");
                position = scanner.nextInt();
                while (!(position >= 1 && position <= 9)) {
                    System.out.println("Wrong!\n" + player1.getName() + ", write position from 1 to 9");
                    position = scanner.nextInt();
                }
                board.placePiece(player2, position);
                board.printBoard();
                board.checkWinner(player1, player2);
                if (player2.getWinner()) {
                    System.out.println("OMG, " + player1.getName() + " you WON!!!");
                    return;
                }
            }
        } else return;
    }
}
