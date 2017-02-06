package game.view;

import game.model.Square;

import javax.swing.JButton;

/**
 * This class represents a square user interface.
 * 
 * @author Charlotte DEVY
 */

@SuppressWarnings("serial")
public class SquareView extends JButton implements Observer {

	private Square square;
		
	public SquareView(Square s) {
		super(Integer.toString(s.getValue()));
		square = s;
		square.addObserver(this);
		setContentAreaFilled(false); 
	}
	
	public Square getSquare() {
		return square;
	}

	public void update() { /* Do nothing */	}
}
