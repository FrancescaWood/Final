import java.awt.Rectangle;

public class Object {

	private int x,y,dx,dy,w,h;
	private String shark1, shark2, shark3, shark4, shark5, shark6, shark7, shark8;
	
	
	public Object() {
		x=600;
		y=450;
		w=100;
		h=100;
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
		w=100;
		h=100;
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
	
	public Boolean paddleCollison(Boat p) {
		//if collision 
		if ((getX()<=(p.getX()+p.getW())) && ((getY()+ getH()>=p.getY())&&(getY()+getH()<=p.getY()+ p.getH()))&&(getX()+getW()>=p.getX()))	{
		horz();
		System.out.println("collision");
		return true; 
	}
		return false;
	}
	
	public Boolean collision(Boat b) {
		
		Rectangle boat = new Rectangle(b.getX(), b.getW(), b.getW(), b.getH());
		Rectangle Shark = new Rectangle(x,y,w,y);
		
		System.out.println("boat x" + b.getX());
		System.out.println("boat y" + b.getY());
		System.out.println("boat w" + b.getW());
		System.out.println("boat h" + b.getH());
		if(boat.intersects(Shark)) {
			
			System.out.println("collision");
			
			
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
	public void moveShark1() {
		x+=dx;
		if (x >= 1600 || x <=20) {
			dx*= -1;
		}}
	public void moveShark2() {
		x+=dx;
		if (x >= 1600 || x <=20) {
			dx*= -1;
		}}
	public void moveShark3() {
		x+=dx;
		if (x <= 20 || x >=1600) {
			dx*= -1;
		}}
	public void moveShark4() {
		x+=dx;
		if (x >= 1600 || x <=20) {
			dx*= -1;
		}}
	public void moveShark5() {
		x+=dx;
		if (x >= 1600 || x <=20) {
			dx*= -1;
		}}
	public void moveShark6() {
		x+=dx;
		if (x >= 1600 || x <=20) {
			dx*= -1;
		}}
	public void moveShark7() {
		x+=dx;
		if (x >= 1600 || x <=20) {
			dx*= -1;
		}}
	public void moveShark8() {
		x+=dx;
		if (x >= 1600 || x <=20) {
			dx*= -1;
		}}
	
	
	
}
