package scenes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import infrastructure.Settings;

public class Menu{
	public String name = "Menu";
	public Graphics2D g = null;
	
//Constructor ------------------------------------------------------------------------------------------

//methods ----------------------------------------------------------------------------------------------

//getter-setter ----------------------------------------------------------------------------------------

//paint ------------------------------------------------------------------------------------------------
	public void paint(Graphics2D g) {
		this.g = g;
		drawBackground();
	}
	
	public void drawBackground() {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Settings.windowWidth, Settings.windowHeight);
	}
}
