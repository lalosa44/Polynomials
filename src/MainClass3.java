
public class MainClass3 {

	public static void main(String[] args) {
		Point p1 = new Point(4, 5);
		Point p2 = new Point(6, 8);

		Segment segment2 = new Segment(p1, p2);
		segment2.setOffset(4, 4);
		Point[] ps = new Point[4];
		ps[0] = new Point (2,2);
		ps[1] = new Point (2,4);
		ps[2] = new Point (4,4);
		ps[3] = new Point (4,2);
		System.out.println(calculatePerimeter(ps));
		Polygon pol = new Polygon(ps);
		System.out.println(pol);
		System.out.println(pol.calculatePerimeterPolygon());


	
	}

	public static double calculatePerimeter(Point[] ps) {
		Segment s1;
		double c = 0;
		for (int i = 0; i < ps.length-1; i++) {
			Point startPoint = ps[i];
			Point endPoint = ps[i+1];
			s1 = new Segment(startPoint, endPoint);
			c = c + s1.module();
			
		}
		 s1 = new Segment(ps[3],ps[0]);
		c = c + s1.module();
		return c;
		
		


	}
}
