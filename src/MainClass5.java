
public class MainClass5 {
	public static final int NUM_ELEMENTS= 10;
	
	public static void main(String[] args) {
		Point [] array;
		array = new Point [NUM_ELEMENTS];
		for (int i=0; i < array.length; i ++) {
			array [i] = new Point(i, i);
		}
		for (Point p: array) {
			System.out.println(p);
		}
		Rectangle [] array2;
		array2 = new Rectangle [NUM_ELEMENTS];
		for (int i = 0; i < array2.length; i++) {
			array2 [i] = new Rectangle(array[i], 1, 1);
		}
		for (Point p: array2) {
			System.out.println(p);
		}
	}
	

}
