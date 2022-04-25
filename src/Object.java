
public class Object {

	private int x,y,dx,dy,w,h;
	private String shark1, shark2, shark3, shark4, shark5, shark6;
	
	
	public Object() {
		x=600;
		y=450;
		w=150;
		h=150;
		dx=1;
		dy=1;
		shark1 = "shark 1.png";
		shark2 = "shark 2.png";
		shark3 = "shark 3.png";
		
	}
	
	public Object(int xV, int yV, int dxV, int dyV) {
		x=xV;
		y=yV;
		w=150;
		h=150;
		dx=dxV;
		dy=dyV;
		shark1 = "shark 1.png";
		shark2 = "shark 2.png";
		shark3 = "shark 3.png";
		
		
		
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
	
	public void setX(int xV) {
		x=xV;
	}
	public void moveShark1() {
		x+=dx;
		y+=dy;
		//System.out.println("x=" + x);
		
		if (x >= 1500 || x <=20) {
			dx*= -1;
		}
		if (y >= 400 || y <= 300) {
			dy*= -1;  
	}}
	public void moveShark2() {
		x+=dx;
		y+=dy;
		//System.out.println("x=" + x);
		
		if (x >= 1500 || x <=20) {
			dx*= -1;
		}
		if (y >= 300 || y <= 200) {
			dy*= -1; 
	}}
		public void moveShark3() {
			x+=dx;
			y+=dy;
			//System.out.println("x=" + x);
			
			if (x <= 20 || x >=1600) {
				dx*= -1;
			}
			if (y >= 1300 || y <= 1400) {
				dy*= -1; 
		}
	}
	
}
