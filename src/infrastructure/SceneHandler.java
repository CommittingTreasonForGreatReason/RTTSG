package infrastructure;

import java.awt.CardLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import scenes.Login;
import scenes.Menu;
import scenes.Scenes;
import sun.applet.Main;

public class SceneHandler implements Runnable {
	Thread t;
	private Scenes activeScene = Scenes.Login;
	private boolean running = true;
	private JPanel containerPanel = new JPanel(new CardLayout());

//Constructor ------------------------------------------------------------------------------------------
	public SceneHandler() {
		addScene(Scenes.Login);
		addScene(Scenes.Menu);
		MainRTTSG.gui.addPanel(containerPanel);
		
		shuffleTo(Scenes.Menu);
		t = new Thread(this);
		t.start();
	}

//run --------------------------------------------------------------------------------------------------
	@Override
	public void run() {
		while (running) {
			containerPanel.repaint();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

//methods ----------------------------------------------------------------------------------------------	
	// adds a scene
	public void addScene(Scenes sceneName) {
		switch (sceneName) {
		case Login:
			containerPanel.add(new Login(), sceneName.toString());
			containerPanel.getComponent(containerPanel.getComponentCount() - 1).setName(sceneName.toString());
			break;
		case Menu:
			containerPanel.add(new Menu(), sceneName.toString());
			containerPanel.getComponent(containerPanel.getComponentCount() - 1).setName(sceneName.toString());
			break;
		default:
			break;
		}

	}

	// schuffels to a named scene
	public void shuffleTo(Scenes sceneEnum) {
		CardLayout layout = (CardLayout) containerPanel.getLayout();
		for (int j = 0; j < containerPanel.getComponentCount(); j++) {
			if (containerPanel.getComponent(j).getName() == sceneEnum.toString()) {
				layout.first(containerPanel);
				for (int i = 0; i < j; i++) {
					layout.next(containerPanel);
				}
			}
		}

	}

//getter-setter ----------------------------------------------------------------------------------------

//paint ------------------------------------------------------------------------------------------------

}
