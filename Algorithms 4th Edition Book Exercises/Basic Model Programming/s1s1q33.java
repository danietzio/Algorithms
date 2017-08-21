public class s1s1q33 {
	public static double dot(double[] x, double[] y) {
		double sum = 0;
		if(x.length == y.length) {
			for (int i = 0; i < y.length; i++) {
				sum += x[i] * y[i];
			}
			return sum;
		}
		else {
			return -1111111.01;
		}
	}
	
	public static double[][] mult(double[][] a, double[][] b) {
		double [][] c = new double[a[0].length][b.length];
		double sum = 0;

		if( a.length == b[0].length ) {
			for (int i = 0; i < a[0].length; i++) {
				for (int j = 0; j < b.length; j++) {
					sum = 0;
					for (int j2 = 0; j2 < a.length; j2++) {
						sum += a[j2][i] * b[j][j2];
					}
					c[j][i] = sum;
				}
			}
			
			return c;
		}
		else {
			double [][] a1 = {{-1111111.01}, {-1111111.01}};
			return a1;
		}
	}
	
	public static double[][] transpose(double[][] a) {
		double [][] b = new double[a[0].length][a.length];
		
		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {
				b[i][j] = a[j][i];
			}
		}
		return b;
	}
	
	public static void main(String[] args) {
		double [][] a = {{1,2},{3,4},{5,6}};
		transpose(a);
	
	}

}
