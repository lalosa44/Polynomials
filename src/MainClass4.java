
public class MainClass4 {
	public static void main(String[] args) { 
		Rectangle R1 = new Rectangle();
		System.out.println(R1);
		R1.moveTo(4, 7);
		System.out.println(R1);
		System.out.println(R1.toString());
		Rectangle R2 = new Rectangle(new Point(2, 2), 8 ,8); 
		System.out.println(R2);
		Segment seg3 = new Segment(new Point(1, 1), new Point(2, 2));
		Rectangle R3 = new Rectangle (seg3);
		System.out.println(R3);
		System.out.println(R3.getPoint());
		System.out.println(R3);
		System.out.println(R3.getTopRightPoint());
		Rectangle R4 = new Rectangle (new Point(5,6), 10, 8);
		System.out.println("Top-Left:" + R4.getTopLeftPoint());
		System.out.println("Top-Right:" + R4.getTopRightPoint());
		System.out.println("Bottom-left:" + R4.getBottomLeftPoint());
		System.out.println("Bottom-right:" + R4.getBottomRightPoint());
		R4.setHeight(0);
		System.out.println(R4);

	}

}
