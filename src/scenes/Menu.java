package scenes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Menu extends JPanel{
	public String name = "Menu";

//Constructor ------------------------------------------------------------------------------------------

//methods ----------------------------------------------------------------------------------------------

//getter-setter ----------------------------------------------------------------------------------------

//paint ------------------------------------------------------------------------------------------------
	@Override
	public void paint(Graphics graphics) {
		Graphics2D g = (Graphics2D) graphics;
		System.out.println("paint green");
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, 200, 200);
	}
}
