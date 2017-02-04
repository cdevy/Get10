package game;

import game.controller.BoardController;
import game.model.Board;
import game.view.MainWindow;

public class App {
	
	public static void main(String[] args){
		/**
		 * Create the game board
		 */
		Board gameBoard = new Board();
		
		/**
		 * Create the board controller
		 */
		BoardController controller = new BoardController(gameBoard);
		
		/**
		 * Start the game
		 */
		new MainWindow(controller);
	}

}
