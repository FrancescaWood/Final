
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage; 
import java.awt.event.*; 


public class Game  extends JPanel implements Runnable, KeyListener{

	
	private BufferedImage back; 
	private int key; 
	private ImageIcon shark11, shark22, shark33, shark44, shark55;
	private Object shark1, shark2, shark3, shark4, shark5;
	
	//new
	
	public Game() {
		new Thread(this).start();	
		this.addKeyListener(this);
		key =-1; 
		

	//	shark1 = new Object(x, y, spped, 1);
		shark1 = new Object(100, 200, 2, 0);
		shark2 = new Object(100, 500, 3, 0);
		shark3 = new Object(100, 700, 2, 0);
		shark4 = new Object(100, 600, 1, 0);
		shark5 = new Object(100, 300, 4, 0);
		
		shark11 = new ImageIcon (shark1.getshark1());
		shark22 = new ImageIcon (shark1.getshark2());
		shark33 = new ImageIcon (shark1.getshark3());
		shark44 = new ImageIcon (shark1.getshark4());
		shark55 = new ImageIcon (shark1.getshark5());
		
		
	}

	
	
	public void run()
	   {
	   	try
	   	{
	   		while(true)
	   		{
	   		   Thread.currentThread().sleep(5);
	            repaint();
	         }
	      }
	   		catch(Exception e)
	      {
	      }
	  	}
	

	
	
	
	public void paint(Graphics g){
		
		Graphics2D twoDgraph = (Graphics2D) g; 
		if( back ==null)
			back=(BufferedImage)( (createImage(getWidth(), getHeight()))); 
		

		Graphics g2d = back.createGraphics();
	
		g2d.clearRect(0,0,getSize().width, getSize().height);
		
		g2d.drawImage(shark11.getImage(), shark1.getX(), shark1.getY(), shark1.getH(), shark1.getW(), this);
		g2d.drawImage(shark22.getImage(), shark2.getX(), shark2.getY(), shark2.getH(), shark2.getW(), this);
		g2d.drawImage(shark33.getImage(), shark3.getX(), shark3.getY(), shark3.getH(), shark3.getW(), this);
		g2d.drawImage(shark44.getImage(), shark4.getX(), shark4.getY(), shark4.getH(), shark4.getW(), this);
		g2d.drawImage(shark55.getImage(), shark5.getX(), shark5.getY(), shark5.getH(), shark5.getW(), this);

		shark1.moveShark1();
		shark2.moveShark2();
		shark3.moveShark3();
		shark4.moveShark4();
		shark5.moveShark5();
		
		twoDgraph.drawImage(back, null, 0, 0);

	}





	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		key= e.getKeyCode();
		System.out.println(key);
		
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
	
		
		
		
	}
	
	
	

	
}
