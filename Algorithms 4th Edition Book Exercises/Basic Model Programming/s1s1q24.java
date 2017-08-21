public class s1s1q24 {

	private static int gcd(int p, int q) {
		StdOut.printf("%d %d\n",p, q);
		int r = 0;
		if ( q == 0 ) return p;
		else {
		   r = p % q;
		}
		return gcd(q, r);
	}
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int [] arr = new int[2];
//		arr = StdIn.readAllInts();
//		int gcdInt = gcd(arr[0], arr[1]);
//		
//		StdOut.println(gcdInt);
	
		while(!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			StdOut.println("1");
		}
	}
}
