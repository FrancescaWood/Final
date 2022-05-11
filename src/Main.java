import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{
	private static final int WIDTH =800;
	private static final int HEIGHT=1200;
	
	public Main () {
		super("SHARK ATTACK");
		setSize(WIDTH, HEIGHT);
		Game2 play = new Game2();
		((Component) play).setFocusable(true);
		
		Color RoyalBlue = new Color(87,175,255);
		
		
		setBackground(RoyalBlue);
		
		
		getContentPane().add(play);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	public static void main(String[] args) {
		Main run = new Main();
		

	}


}
