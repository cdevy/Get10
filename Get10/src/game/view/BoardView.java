package game.view;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import game.model.Board;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BoardView extends JPanel implements Observer {
	
	private Board board;
	private SquareView grid[] = new SquareView[25];
	
	public BoardView(Board board) {
		super(new GridLayout(5, 5));
		this.board = board;
		for (int i=0; i<25; i++) {
			grid[i] = new SquareView(board.getSquare(i));;
			add(grid[i]);
		}
		(this.board).addObserver(this);
	}

	public void update(Observable obs, Object arg) {}
}
