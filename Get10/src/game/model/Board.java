package game.model;

import java.util.Observable;

public class Board extends Observable {
	
	private Square grid[] = new Square[25];
	
	public Board () {
		for (int i=0; i<25; i++) {
			grid[i] = new Square();
		}
	}
	
	public Square getSquare(int i) {
		return grid[i];
	}
}
