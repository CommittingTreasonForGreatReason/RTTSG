package gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;

import javax.swing.JPanel;

import infrastructure.MainRTTSG;
import infrastructure.Settings;

public class Draw extends JPanel implements Runnable {
	private Thread t;
	private boolean running = true;

//Constructor ----------------------------------------------------------------------------
	public Draw() {		
		
		t = new Thread(this);
		t.start();
	}
	
	
//run --------------------------------------------------------------------------------------
	@Override
	public void run() {
		while(running) {
			super.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

//methods ---------------------------------------------------------------------------------
	@Override
	public void paint(Graphics graphics) {
		Graphics2D g = (Graphics2D)graphics;
		g.setRenderingHint(
				RenderingHints.KEY_ANTIALIASING,
	            RenderingHints.VALUE_ANTIALIAS_ON);
		g.setRenderingHint(
				RenderingHints.KEY_INTERPOLATION,
				RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		g.setRenderingHint(
				RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setRenderingHint(
				RenderingHints.KEY_RENDERING,
				RenderingHints.VALUE_RENDER_SPEED);
		g.setRenderingHint(
				RenderingHints.KEY_COLOR_RENDERING,
				RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		if(MainRTTSG.sceneHandler != null)
			MainRTTSG.sceneHandler.paint(g);
	}
}
