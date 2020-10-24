package input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import infrastructure.MainRTTSG;

public class MouseHandler implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		MainRTTSG.sceneHandler.mouseInput(e);
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
