import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyPolynomial {

	private double[] coeffs;

	public MyPolynomial(double... coeffs) {
		this.coeffs = coeffs;
	}

	public MyPolynomial(String filename) {
		Scanner in = null;
		try {
			in = new Scanner(new File(filename)); // open file
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int degree = in.nextInt(); // read the degree
		coeffs = new double[degree + 1]; // allocate the array
		for (int i = 0; i < coeffs.length; ++i) {
			coeffs[i] = in.nextDouble();
		}

	}
	
	public double getDegree() {
		return coeffs[coeffs.length-1];
		
	}
	
}
