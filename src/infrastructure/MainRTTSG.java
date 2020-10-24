package infrastructure;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import gui.GUI;

public class MainRTTSG {
	public static GUI gui;
	public static SceneHandler sceneHandler;
	
	public static void main(String[] args) {
		gui = new GUI();
		sceneHandler = new SceneHandler();
	}
}

//try {
//	Socket socket = new Socket("194.13.81.219", 3455);
//	PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
//	printWriter.println("quarkfelix");
//	printWriter.println("passwort");
//	printWriter.flush();
//	printWriter.close();
//} catch (IOException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
