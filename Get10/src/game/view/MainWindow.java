package game.view;

import game.controller.BoardController;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {

    private BoardController boardController;

    public MainWindow(BoardController controller) {
    	super("Get10");
    	
    	boardController = controller;
    	
    	setPreferredSize(new Dimension(400, 300));
        setLayout(new BorderLayout());
        add(boardController.getView(), BorderLayout.CENTER);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}