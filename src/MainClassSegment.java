
public class MainClassSegment {

	public static void main(String[] args) {

		
		Segment segment1 = new Segment(new Point(4, 5), new Point(6, 8));
		segment1.setOffset(2, 2);
		System.out.println(segment1);
		System.out.println(segment1.module());
		System.out.println();
	}

}
