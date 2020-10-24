package scenes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Login extends JPanel {
	public String name = "Login";
	
//Constructor ------------------------------------------------------------------------------------------

//methods ----------------------------------------------------------------------------------------------

//getter-setter ----------------------------------------------------------------------------------------

//paint ------------------------------------------------------------------------------------------------
	@Override
	public void paint(Graphics graphics) {
		Graphics2D g = (Graphics2D) graphics;
		System.out.println("paint blue");
		g.setColor(Color.blue);
		g.fillRect(0, 0, 200, 200);
	}
}
