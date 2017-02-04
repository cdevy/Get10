package game.model;

import java.util.Observable;
import java.util.Random;

public class Square extends Observable {
	
	private int value;
	
	public Square() {
		setValue(randomNumber(1, 4));
	}
	
	private int randomNumber(int min, int max) {
		int res;
		Random rand = new Random();
		res = min + rand.nextInt(max+1 - min);
		return res;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
