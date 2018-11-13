
public class MainClass {

	public static void main(String[] args) {
		
		Point p;
		p = new Point();
		System.out.println(p.toString());
		p.moveTo(4,6);
		System.out.println(p.toString());
		Point p2 = new Point(5,5);
		System.out.println(p2);
		Point p3 = p2;
		System.out.println(p3);
		p3.moveTo(1,1);
		System.out.println(p2);
	}

}
