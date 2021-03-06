
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.*; 


public class Game2  extends JPanel implements Runnable, KeyListener{

	
	private BufferedImage back; 
	private int key, randomFact; 
	private ImageIcon shark11, shark22, shark33, shark44, shark55, shark66, shark77, shark88, boat11;
	private Object shark1, shark2, shark3, shark4, shark5, shark6, shark7, shark8;
	private Boat boat1;
	private Boolean hideRect;
	private ArrayList <Facts> randFact;
	private boolean playmusic;
	private Player p;
	

	
	private boolean up2, down2, right, left = false;
	
	
	public Game2() {
		new Thread(this).start();	
		this.addKeyListener(this);
		key =-1; 
		
		boat1 = new Boat();
		boat11 = new ImageIcon (boat1.getBoat1());
		
		hideRect = false;
		randomFact = randomNumber();
		
		p = new Player();
		playmusic = true;
		p.playmusic("bubbles.wav");
		
		
		try {
			randFact= setFact("shark facts.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
		}
			

	//	shark1 = new Object(x, y, spped, 1);
		shark1 = new Object(100, 50, 1, 0);
		shark2 = new Object(100, 150, 3, 0);
		shark3 = new Object(100, 250, 4, 0);
		shark4 = new Object(100, 350, 6, 0);
		shark5 = new Object(100, 450, 3, 0);
		shark6 = new Object(100, 550, 2, 0);
		shark7 = new Object(100, 650, 1, 0);
		shark8 = new Object(100, 750, 2, 0);
		
		shark11 = new ImageIcon (shark1.getshark1());
		shark22 = new ImageIcon (shark2.getshark2());
		shark33 = new ImageIcon (shark3.getshark3());
		shark44 = new ImageIcon (shark4.getshark4());
		shark55 = new ImageIcon (shark5.getshark5());
		shark66 = new ImageIcon (shark6.getshark6());
		shark77 = new ImageIcon (shark7.getshark7());
		shark88 = new ImageIcon (shark8.getshark8());
		
		
		
	}

	
	public ArrayList <Facts> setFact(String fileName) throws FileNotFoundException {
		ArrayList <Facts> temp = new ArrayList <Facts> ();
		File file = new File(fileName);
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			temp.add(new Facts(sc.nextLine()));
		}
		return temp;
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
	
	
	
	


		
	public void resetGame () {
		boat1.setX(350);
		boat1.setY(900);
		
		
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


		shark1.moveShark();
		shark2.moveShark();
		shark3.moveShark();
		shark4.moveShark();
		shark5.moveShark();
		shark6.moveShark();
		shark7.moveShark();
		shark8.moveShark();
	
		g2d.drawImage(boat11.getImage(), boat1.getX(), boat1.getY(), boat1.getH(), boat1.getW(), this);
		
	
		
		if(hideRect) {
			g2d.drawRect(150, 300, 570, 200);
			g2d.fillRect(150, 300, 570, 200);
			Color Lblue = new Color(173,216,230);
			g2d.setColor(Lblue);
			g2d.setFont(new Font("Castellar", Font.PLAIN, 30) );
			g2d.drawString("Oh No! You hit a shark!", 170, 330);
			g2d.setFont(new Font("Broadway", Font.PLAIN, 15) );
			g2d.drawString("Did you know?", 170, 360);
			g2d.setFont(new Font("Broadway", Font.PLAIN, 20) );
			g2d.drawString(randFact.get(randomFact).getFact(), 155, 390);
			g2d.setFont(new Font("Times New Roman", Font.PLAIN, 20) );
			g2d.drawString("Press SPACE to restart", 170, 450);
			playmusic=false;
			
		}
		

		
		boat1.move(up2, down2, right, left, getHeight() - boat1.getH(), getWidth()- boat1.getW() );
	
//		if (boat1.getY() == 500 ) {
			
//			g2d.drawString("YOU WIN", 10, 40);
//}


		
		if (collision()) {
		hideRect = true;
		
	}
		
		
		
		
		twoDgraph.drawImage(back, null, 0, 0);
	}
		//COLOICON CODE
		public boolean collision() {
			
			if(shark1.collision(boat1) || shark2.collision(boat1) || shark3.collision(boat1) || shark4.collision(boat1) || shark5.collision(boat1)|| shark6.collision(boat1)|| shark7.collision(boat1)|| shark8.collision(boat1)) {
			
			return true;
		} 
		
		return false;
			}
	
	

		public int randomNumber() {
			Random rand = new Random();
			return rand.nextInt(21);
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
		} else if (key == 39) { // right arrow
			right = true;
		} else if (key == 37) { // left arrow
			left = true;
		}
		
	 if(key == 32) {
		resetGame();	
		hideRect = false;
		randomFact = randomNumber();
		}
		
	
	}



	@Override
	public void keyReleased(KeyEvent e) {
	
		if (key == 38) { // Up arrow
			up2 = false;
		} else if (key == 40) { // Down arrow
			down2 = false;
		} else if (key == 39) { // right arrow
			right = false;
		} else if (key == 37) { // left arrow
			left = false;
		}
		
		 if(key == 32) {
			resetGame();	
			hideRect = false;
			randomFact = randomNumber();
			}
				
			
		
	}
	
	
	

	
}
