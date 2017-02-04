package game.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import game.model.Square;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class SquareView extends JButton implements Observer {
	
	private Square square;
	
	public SquareView(Square s) {
		super(Integer.toString(s.getValue()));
		square = s;
		square.addObserver(this);
		
		addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println(square.getValue());
			}
		
		});
	}

	public void update(Observable o, Object arg) {}
}
