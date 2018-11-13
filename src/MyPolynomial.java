import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MyPolynomial {
	//coment

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
	public MyPolynomial mult(MyPolynomial p) {
		double[] result = new double[getDegree() + p.getDegree()];
		for (int i=0; i<result.length; i++) {
			result[i] = 0;
		}
		double[] coeffsP = p.getCoeffs();
		for (int i=0; i<coeffs.length; i++) {
			for (int j=0; j<coeffsP.length; j++) {
				result[i + j] += coeffs[i] * coeffsP[j];
			}
		}
		MyPolynomial newPol = new MyPolynomial(result);
	}
}
