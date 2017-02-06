package game.model;

import java.util.ArrayList;

import game.view.Observer;

/**
 * Rewriting of the Observable class.
 * 
 * @author Charlotte DEVY
 */

public class Observable {

	protected ArrayList<Observer> observers;
	
	public Observable() {
		observers = new ArrayList<Observer>();
	}
	
	public void addObserver(Observer obs) {
		if (observers != null) {
			observers.add(obs);
		}
	}
	
	public void removeAll() {
		if (observers != null) {
			observers.clear();
		}
	}
	
	public void removeObserver(Observer obs) {
		if (observers != null) {
			observers.remove(obs);
		}
	}
	
	public void notifyObservers() {
		for (Observer obs : observers) {
			obs.update();
		}
	}
}
