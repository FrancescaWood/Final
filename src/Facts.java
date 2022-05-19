import java.util.Random;

import javax.swing.ImageIcon;

public class Facts {

	private String fact;
	private ImageIcon pic;
	
	private int x, y, w, h;
	
	public Facts() {
		fact = " ";
		x=0;
		y=0;
		w=0;
		h=0;
		
	}
	
	public Facts (String n) {
		fact = n;
		x=0;
		y=0;
		w=0;
		h=0;	
	}
	

	
	public String toString() {
		return fact;
	}
	
	public String getFact() {
		return fact;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getW() {
		return w;
	}
	public int getH() {
		return h;
	}
	
	//setters
	public void setFact(String n) {
		fact = n;
	}
	
	// xV  = xValue
	public void setX(int xV) {
		x=xV;
	}
	public void setY(int yV) {
		y=yV;
	}
	public void setW(int wV) {
		w=wV;
	}
	public void setH(int hV) {
		h=hV;
	}

}
