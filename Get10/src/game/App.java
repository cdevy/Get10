package game;

import game.controller.Controller;
import game.model.Board;
import game.view.MainWindow;
import game.view.SquareView;

/**
 * This class represents the application.
 * 
 * @author Charlotte DEVY
 */

public class App {
	
	public static void main(String[] args){	
		/**
		 * Create the game board
		 */
		Board gameBoard = new Board();

		/**
		 * Create the view
		 */
		MainWindow view = new MainWindow(gameBoard);
		
		/**
		 * Create the controller
		 */
		Controller controller = new Controller(view);
		
		/**
		 * Add the controller as action listener for every button
		 */
		for (SquareView sv : (view.getBoardView()).getGrid()) {
			sv.addActionListener(controller);
		}
		(view.getReset()).addActionListener(controller);		
	}

}
