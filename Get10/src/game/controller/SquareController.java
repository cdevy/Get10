package game.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import game.model.Square;
import game.view.SquareView;

public class SquareController implements ActionListener {
	
	private Square square;
	@SuppressWarnings("unused")
	private SquareView view;

	public SquareController(Square s) {
		square = s;
		view = new SquareView(square);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println(square.getValue());
	}
}
