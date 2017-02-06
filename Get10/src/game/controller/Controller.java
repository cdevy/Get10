package game.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import game.view.MainWindow;
import game.view.SquareView;

/**
 * This class controls both the model and the view (MVC pattern).
 * It processes user's interactions with the application.
 * 
 * @author Charlotte DEVY
 */

public class Controller implements ActionListener {
	
	MainWindow view;

	public Controller(MainWindow view) {
		this.view = view;
	}
	
	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
		if (object instanceof SquareView) {
			int clicks = Integer.parseInt(view.getTotalOfClicks().getText());
			view.getTotalOfClicks().setText(Integer.toString(clicks+1));
		} else if (object instanceof JMenuItem) {
			view.getTotalOfClicks().setText("0");
		}
	}
}
