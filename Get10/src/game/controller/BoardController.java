package game.controller;

import game.model.Board;
import game.view.BoardView;

public class BoardController {
	
	private Board board;
	private BoardView view;
	private SquareController grid[] = new SquareController[25];

	public BoardController(Board board) {
		this.board = board;
		view = new BoardView(this.board);
		for (int i=0; i<25; i++) {
			grid[i] = new SquareController(board.getSquare(i));
		}
	}
	
	public BoardView getView() {
		return view;
	}
	
}
