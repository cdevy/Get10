package game.view;

import game.model.Board;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * This class represents the main window.
 * 
 * @author Charlotte DEVY
 */

@SuppressWarnings("serial")
public class MainWindow extends JFrame {

	private Board board;
    
    private BoardView boardView;
    
    private JPanel southPanel;
    private JLabel label;
	private JButton totalOfClicks;
	
	private JMenuBar bar; 
	private JMenu menu;
	private JMenuItem reset;

    public MainWindow(Board board) {
    	super("Get10");
    	
    	this.board = board;
    	
    	boardView = new BoardView(this.board);
    	
    	// Creation of the menu
    	bar = new JMenuBar();
    	menu = new JMenu("Menu");
    	reset = new JMenuItem("Réinitialiser");
    	menu.add(reset);
    	bar.add(menu);
    	
    	// Creation of the south panel
    	southPanel = new JPanel(new FlowLayout());
    	label = new JLabel("Nombre de clic(s) : ");
    	southPanel.add(label);
    	totalOfClicks = new JButton("0");
    	totalOfClicks.setFocusPainted(false);
    	totalOfClicks.setBorderPainted(false);
    	totalOfClicks.setContentAreaFilled(false);    	
    	southPanel.add(totalOfClicks);
    	
    	setPreferredSize(new Dimension(400, 300));
        setLayout(new BorderLayout());
        
        add(bar, BorderLayout.NORTH);
        add(boardView, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    
    public BoardView getBoardView() {
    	return boardView;
    }
    
    public JButton getTotalOfClicks() {
    	return totalOfClicks;
    }
    
    public JMenuItem getReset() {
    	return reset;
    }
}