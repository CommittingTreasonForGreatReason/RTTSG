package scenes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import libary.*;

import javax.swing.JPanel;

import infrastructure.Settings;

public class Login {
	public String name = "Login";
	public Graphics2D g = null;
	
	//Components
	private TextArea usernameArea;
	private TextArea passwordArea;
	private TextInputField usernameInput;
	private TextInputField passwordInput;
	
	
//Constructor ------------------------------------------------------------------------------------------
	public Login() {
		setupComponents();
	}
//methods ----------------------------------------------------------------------------------------------
	public void setupComponents() {
		usernameArea = new TextArea(100, 100, 200, 50);
		usernameArea.setBackgroundActive(true);
		usernameArea.setBackgroundColor(new Color(38, 38, 38));
		usernameArea.setTextColor(new Color(158, 158, 158));
		usernameArea.setOutlineActive(false);
		usernameArea.setText("Username:");
		usernameArea.setTextFontSize(25);

		passwordArea = new TextArea(100, 200, 200, 50);
		passwordArea.setBackgroundActive(true);
		passwordArea.setBackgroundColor(new Color(38, 38, 38));
		passwordArea.setTextColor(new Color(158, 158, 158));
		passwordArea.setOutlineActive(false);
		passwordArea.setText("Password:");
		passwordArea.setTextFontSize(25);
		
		usernameInput = new TextInputField(350, 100, 300, 50);
		usernameInput.setBackgroundColor(new Color(38, 38, 38));
		usernameInput.setTextColor(new Color(158, 158, 158));
		usernameInput.setTextLineColor(Color.BLACK);
		usernameInput.setTextFontSize(25);
		usernameInput.setDistanceTextToBottom(20);
		usernameInput.setTextLineActive(false);
		usernameInput.setStyle(Style.edgy);
		
		passwordInput = new TextInputField(350, 200, 300, 50);
		passwordInput.setBackgroundColor(new Color(38, 38, 38));
		passwordInput.setTextColor(new Color(158, 158, 158));
		passwordInput.setTextLineColor(Color.BLACK);
		passwordInput.setTextFontSize(25);
		passwordInput.setDistanceTextToBottom(20);
		passwordInput.setTextLineActive(false);
		passwordInput.setStyle(Style.edgy);
		
		
	}
	
	public void keyInput(KeyEvent e) {
		usernameInput.setText(e);
		passwordInput.setText(e);
	}
	
	public void mouseInput(MouseEvent e) {
		usernameInput.contains(e.getX(), e.getY()-37);
		passwordInput.contains(e.getX(), e.getY()-37);
	}
//getter-setter ----------------------------------------------------------------------------------------

//paint ------------------------------------------------------------------------------------------------
	public void paint(Graphics2D g) {
		this.g = g;
		
		drawBackground();
		drawComponents();
	}
	
	public void drawBackground() {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Settings.windowWidth, Settings.windowHeight);
	}
	
	public void drawComponents() {
		usernameArea.paint(g);
		passwordArea.paint(g);
		usernameInput.paint(g);
		passwordInput.paint(g);
	}
}
