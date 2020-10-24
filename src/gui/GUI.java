package gui;

import java.awt.CardLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;

import infrastructure.*;
import input.KeyHandler;
import input.MouseHandler;
import scenes.Login;
import scenes.Menu;

public class GUI {
	private JFrame jf;
	private Draw draw;

//Constructor ------------------------------------------------------------------------------------------
	public GUI() {
		initiateJFrame();
	}

//run --------------------------------------------------------------------------------------------------

//methods ----------------------------------------------------------------------------------------------
	public void initiateJFrame() {
		jf = new JFrame();
		jf.setSize(Settings.windowWidth, Settings.windowHeight);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		draw = new Draw();
		jf.add(draw);
		jf.addKeyListener(new KeyHandler());
		jf.addMouseListener(new MouseHandler());
		jf.setVisible(true);
	}


//getter-setter ----------------------------------------------------------------------------------------

}
