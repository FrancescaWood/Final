import java.awt.Color;

public class Boat {

	private int x, y, width, height, dx, dy;
	private Color paddleColor; 
	private int score; 
	private String boat1;
	
	public Boat() {
		x= 350;
		y=900;
		width=80;
		height=60;
		dx = 1;
		dy = 1;
		boat1 = "boat1111-removebg-preview.png";
		paddleColor = Color.black;
		score=0;
	}
	
	public Boat(int xV) {
		x=xV;
		y=300;
		width=80;
		height=60;
		boat1 = "boat1111-removebg-preview.png";
		score=0;
		dx = 1;
		dy = 1;
	}
		
	
	public String getBoat1() {
		return boat1;
	}
	
	
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getW() {
		return width;
	}
	public int getH() {
		return height;
	}
	public int getScore() {
		return score;
	}
	public Color getColor() {
		return paddleColor;
	}
	
	public void change1Score() {
		score++;
	}
	public void change2Score() {
		score++;
	}

	public void setX(int dx) {
		x+=dx;
	}
	
	public void move(boolean up, boolean down, int windowheight) {
		if (up == true && y > 1) {
			y -= dy;
		} else if (down == true && y < windowheight) {
			y += dy;
		}
	}
	
}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	

