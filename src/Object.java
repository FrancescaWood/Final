import java.awt.Rectangle;

public class Object {

	private int x,y,dx,dy,w,h;
	private String shark1, shark2, shark3, shark4, shark5, shark6, shark7, shark8;
	
	
	public Object() {
		x=600;
		y=450;
		w=60;
		h=60;
		dx=1;
		dy=1;
		shark1 = "shark 1.png";
		shark2 = "shark 2.png";
		shark3 = "shark 3.png";
		shark4 = "shark 4.png";
		shark5 = "shark 5.png";
		shark6 = "shark 6.png";
		shark7 = "shark 7.png";
		shark8 = "shark 8.png";
		
		
	}
	
	public Object(int xV, int yV, int dxV, int dyV) {
		x=xV;
		y=yV;
		w=60;
		h=60;
		dx=dxV;
		dy=dyV;
		shark1 = "shark 1.png";
		shark2 = "shark 2.png";
		shark3 = "shark 3.png";
		shark4 = "shark 4.png";
		shark5 = "shark 5.png";
		shark6 = "shark 6.png";
		shark7 = "shark 7.png";
		shark8 = "shark 8.png";
		
		
	}
	
	
	public Boolean collision(Boat b) {
		
		Rectangle boat = new Rectangle(b.getX(), b.getY(), b.getW()-20, b.getH()-12);
		Rectangle Shark = new Rectangle(x,y,w,h);
		
	
		if(boat.intersects(Shark)) {
			horz();
		
			return true;
		}
		return false;
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
	public String getshark1() {
		return shark1;
	}
	public String getshark2() {
		return shark2;
	}
	public String getshark3() {
		return shark3;
	}
	public String getshark4() {
		return shark4;
	}
	public String getshark5() {
		return shark5;
	}
	public String getshark6() {
		return shark6;
	}
	public String getshark7() {
		return shark7;
	}
	public String getshark8() {
		return shark8;
	}
	
	
	
	public void horz () {
		dx*=-1;
		
	}
	public void vert() {
		dy*= -1; 
	}
	
	
	
	
	
	public void setX(int xV) {
		x=xV;
	}
	public void moveShark() {
		x+=dx;
		if (x >= 700 || x <=20) {
			dx*= -1;
		}
		}
	
	
	
	
}
