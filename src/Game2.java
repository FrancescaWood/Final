
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage; 
import java.awt.event.*; 


public class Game2  extends JPanel implements Runnable, KeyListener{

	
	private BufferedImage back; 
	private int key; 
	private ImageIcon shark11, shark22, shark33, shark44, shark55, shark66, shark77, shark88, boat11;
	private Object shark1, shark2, shark3, shark4, shark5, shark6, shark7, shark8;
	private Boat boat1;
	

	
	private boolean up2, down2 = false;
	
	
	public Game2() {
		new Thread(this).start();	
		this.addKeyListener(this);
		key =-1; 
		
		boat1 = new Boat();
		boat11 = new ImageIcon (boat1.getBoat1());

		shark1 = new Object();
		shark2 = new Object();
		shark3 = new Object();
		shark4 = new Object();
		shark5 = new Object();
		shark6 = new Object();
		shark7 = new Object();
		shark8 = new Object();
	
		
		


	//	shark1 = new Object(x, y, spped, 1);
		shark1 = new Object(100, 50, 1, 0);
		shark2 = new Object(100, 150, 3, 0);
		shark3 = new Object(100, 250, 4, 0);
		shark4 = new Object(100, 350, 6, 0);
		shark5 = new Object(100, 450, 3, 0);
		shark6 = new Object(100, 550, 2, 0);
		shark7 = new Object(100, 650, 1, 0);
		shark8 = new Object(100, 750, 5, 0);
		
		shark11 = new ImageIcon (shark1.getshark1());
		shark22 = new ImageIcon (shark2.getshark2());
		shark33 = new ImageIcon (shark3.getshark3());
		shark44 = new ImageIcon (shark4.getshark4());
		shark55 = new ImageIcon (shark5.getshark5());
		shark66 = new ImageIcon (shark6.getshark6());
		shark77 = new ImageIcon (shark7.getshark7());
		shark88 = new ImageIcon (shark8.getshark8());
		
		
		
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
		g2d.drawImage(shark66.getImage(), shark6.getX(), shark6.getY(), shark6.getH(), shark6.getW(), this);
		g2d.drawImage(shark77.getImage(), shark7.getX(), shark7.getY(), shark7.getH(), shark7.getW(), this);
		g2d.drawImage(shark88.getImage(), shark8.getX(), shark8.getY(), shark8.getH(), shark8.getW(), this);


		shark1.moveShark1();
		shark2.moveShark2();
		shark3.moveShark3();
		shark4.moveShark4();
		shark5.moveShark5();
		shark6.moveShark6();
		shark7.moveShark7();
		shark8.moveShark8();
		
		
		
		g2d.drawImage(boat11.getImage(), boat1.getX(), boat1.getY(), boat1.getH(), boat1.getW(), this);
		boat1.move(up2, down2, getHeight() - boat1.getW());

		collision();
		
		
		twoDgraph.drawImage(back, null, 0, 0);
	}
		//COLOICON CODE
		public void collision() {
			
			System.out.println("test");
			
			if(!shark1.collision(boat1));
			if(!shark2.collision(boat1));
			if(!shark3.collision(boat1));
			if(!shark4.collision(boat1));
			if(!shark5.collision(boat1));
			if(!shark6.collision(boat1));
			if(!shark7.collision(boat1));
			if(!shark8.collision(boat1));
			
			
		
			if (!shark1.paddleCollison(boat1)&& shark1.getX() < boat1.getX()+shark1.getW())
			{
		//	shark1.reset();
				}
		
		 if (!shark2.paddleCollison(boat1)&& shark2.getX() < boat1.getX()+shark2.getW()){
			
				}
		 if (!shark3.paddleCollison(boat1)&& shark3.getX() < boat1.getX()+shark3.getW()){
				
			}
		if (!shark4.paddleCollison(boat1)&& shark4.getX() < boat1.getX()+shark4.getW()){
				
				}
		 if (!shark5.paddleCollison(boat1)&& shark5.getX() < boat1.getX()+shark5.getW()){
		
				}
		 if (!shark6.paddleCollison(boat1)&& shark6.getX() < boat1.getX()+shark6.getW()){
				
				}
		 if (!shark7.paddleCollison(boat1)&& shark7.getX() < boat1.getX()+shark7.getW()){
				
				}
		 if (!shark8.paddleCollison(boat1)&& shark8.getX() < boat1.getX()+shark8.getW()){
				
				}
				
				
		
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
		
		if (key == 38) { // Up arrow
			up2 = true;
		} else if (key == 40) { // Down arrow
			down2 = true;
		}
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
	
		if  (key == 38) { // Up arrow
			up2 = false;
		} else if (key == 40) { // Down arrow
			down2 = false;
		}
		
		
	}
	
	
	

	
}