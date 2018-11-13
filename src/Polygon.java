
public class Polygon {

	private Point[] points;

	public Polygon(Point[] points) {
		this.points = points;
	}

	public Polygon() {
		points = null;
	}

	@Override
	public String toString() {
		String s = "";
		for (Point p : points) {
			s = s + p.toString() + " - ";
		}
		s = s + points[0];
		return s;

	}

	public double calculatePerimeterPolygon() {
		Segment s1;
		double c = 0;
		for (int i = 0; i < points.length - 1; i++) {
			Point startPoint = points[i];
			Point endPoint = points[i + 1];
			s1 = new Segment(startPoint, endPoint);
			c = c + s1.module();

		}
		s1 = new Segment(points[3], points[0]);
		c = c + s1.module();
		return c;

	}
	public void setOffset(int offX, int offY) {
		for (int i=0; i<points.length; i++) {
			points[i].setOffset(offX,offY);
		}

		
	}

}