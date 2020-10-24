package infrastructure;

import java.awt.CardLayout;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPanel;

import gui.Draw;
import scenes.Login;

public class SceneHandler{
	private Login login;
	
//Constructor ------------------------------------------------------------------------------------------
	public SceneHandler() {
		login = new Login();
	}

//methods ----------------------------------------------------------------------------------------------	
	public void keyInput(KeyEvent e) {
		login.keyInput(e);
	}
	
	public void mouseInput(MouseEvent e) {
		login.mouseInput(e);
	}

//getter-setter ----------------------------------------------------------------------------------------
	
	
//paint ------------------------------------------------------------------------------------------------
	public void paint(Graphics2D g) {
		
		login.paint(g);
	}

	
}






////adds a scene
//	public void addScene(Scenes sceneName) {
//		switch (sceneName) {
//		case Login:
//			containerPanel.add(new Login(), sceneName.toString());
//			containerPanel.getComponent(containerPanel.getComponentCount() - 1).setName(sceneName.toString());
//			break;
//		case Menu:
//			containerPanel.add(new Menu(), sceneName.toString());
//			containerPanel.getComponent(containerPanel.getComponentCount() - 1).setName(sceneName.toString());
//			break;
//		default:
//			break;
//		}
//
//	}
//
//	// schuffels to a named scene
//	public void shuffleTo(Scenes sceneEnum) {
//		CardLayout layout = (CardLayout) containerPanel.getLayout();
//		for (int j = 0; j < containerPanel.getComponentCount(); j++) {
//			if (containerPanel.getComponent(j).getName() == sceneEnum.toString()) {
//				this.activeScene = sceneEnum;
//				layout.first(containerPanel);
//				for (int i = 0; i < j; i++) {
//					layout.next(containerPanel);
//				}
//			}
//		}
//
//	}
