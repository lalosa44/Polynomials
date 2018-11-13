
public class Point extends Object {
	private int x;
	private int y;
	
	public Point() {
		x = 0;
		y = 0;
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	public void moveTo(int newX, int newY) {
		x=newX;
		y=newY;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setOffset (int offX, int offY) {
		x = x + offX; 
		y = y + offY;
	}
	
	public static double distance(Point v1, Point v2) {
		int x1 = v1.getX();
		int y1 = v1.getY();
		int x2 = v2.getX();
		int y2 = v2.getY();
		int c1 = x2-x1;
		int c2 = y2-y1;
		
		return Math.sqrt(c1 * c1 + c2 * c2);
	}
	
}
