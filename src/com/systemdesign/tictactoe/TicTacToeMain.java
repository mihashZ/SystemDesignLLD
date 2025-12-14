package com.systemdesign.tictactoe;

public class TicTacToeMain {
	
	public static void main(String args[]) {
		run();
	}
	
    public static void run() {
        Player player1 = new Player("Player 1", 'X');
        Player player2 = new Player("Player 2", 'O');

        Game game = new Game(player1, player2);
        game.play();
    }
}
