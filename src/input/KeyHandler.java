package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import infrastructure.MainRTTSG;

public class KeyHandler implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		MainRTTSG.sceneHandler.keyInput(e);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
