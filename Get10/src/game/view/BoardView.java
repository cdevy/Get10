package game.view;

import java.awt.GridLayout;

import game.model.Board;

import javax.swing.JPanel;

/**
 * This class represents the board user interface.
 * 
 * @author Charlotte DEVY
 */

@SuppressWarnings("serial")
public class BoardView extends JPanel implements Observer {
	
	private Board board;
	private SquareView grid[] = new SquareView[25];
	
	public BoardView(Board board) {
		super(new GridLayout(5, 5));
		this.board = board;
		for (int i=0; i<25; i++) {
			grid[i] = new SquareView(board.getSquare(i));
			add(grid[i]);
		}
		(this.board).addObserver(this);
	}
	
	public SquareView[] getGrid() {
		return grid;
	}
	
	public void update() { /* Do nothing */	}
}
