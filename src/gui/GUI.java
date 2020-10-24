package gui;

import java.awt.CardLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;

import infrastructure.MainRTTSG;
import scenes.Login;
import scenes.Menu;
import scenes.Scenes;

public class GUI {
	private JFrame jf;
	

//Constructor ------------------------------------------------------------------------------------------
	public GUI() {
		initiateJFrame();
	}

//run --------------------------------------------------------------------------------------------------

//methods ----------------------------------------------------------------------------------------------
	public void initiateJFrame() {
		jf = new JFrame();
		jf.setSize(900, 700);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

	public void addPanel(JPanel containerPanel) {
		jf.add(containerPanel);
	}

//getter-setter ----------------------------------------------------------------------------------------

}
