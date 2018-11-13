
public class Rectangle extends Point {
	private int width;
	private int height;

	public Rectangle() {
		super();
		width = 0;
		height = 0;
	}

	@Override
	public String toString() {

		return "(" + getX() + "," + getY() + ")" + " " + "width:" + width + " " + "heigth:" + height;

	}
	public Rectangle (Point p, int newWidth, int newHeight) {
		super(p.getX(), p.getY());
		this.width = newWidth;
		this.height = newHeight;
		
	}
	public Rectangle (Segment seg) {
		super(Math.min(seg.getStartPoint().getX(), seg.getEndPoint().getX()), Math.min(seg.getStartPoint().getY(), seg.getEndPoint().getY()));
		Point p1 = seg.getStartPoint();
		Point p2 = seg.getEndPoint();
		width = Math.abs(p1.getX() - p2.getX());
		height = Math.abs(p1.getY() - p2.getY());
		
	}
	public double getArea() {
		double a;
		a = width * height;
		return a;
	}
	public Point getPoint() {
		Point p1 = new Point(getX(), getY());
		return p1;
		
	}
	public Point getTopLeftPoint() {
		int y;
		y = height + getY();
		Point p= new Point(getX(), y);
		return p;

	}
	public Point getTopRightPoint() {
		int y, x;
		y = height + getY();
		x = width + getX();
		Point p= new Point(x, y);
		return p;
	}
	public Point getBottomLeftPoint() {
		Point p1 = new Point(getX(), getY());
		return p1;
	}
	public Point getBottomRightPoint() {
		int x;
		x = width + getX();
		Point p1 = new Point (x, getY());
		return p1;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setWidth (int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
