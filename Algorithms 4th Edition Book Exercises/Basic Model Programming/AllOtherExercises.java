public class AllOtherExercises {
	
	// Ex 1.1.14
	public static int lg(double N) {
		int count = 0;
		while ( N >= 1 ) {
			count++;
			N = N / 2;
		}
		
		return count++;
	}
	
	// Ex 1.1.15
	private static int[] histogram(int[] a, int M) {
		int[] arr = new int[M];
		for(int i = 0; i < M;i++ ){
			int count = 0;
			for(int j = 0; j < a.length; j++) {
				if( a[j] == i ) count++;
			}
			arr[i] = count;
		}
	
		return arr;
	}
	
	//  Ex 1.1.16
	public static String exR1(int n)
	{
		if (n <= 0) return "";
		return exR1(n-3) + n + exR1(n-2) + n;
	}
	
	// Ex 1.1.17
	public static String exR2(int n)
	{
		String s = exR2(n-3) + n + exR2(n-2) + n;
		if (n <= 0) return "";
		return s;
	}
	
	// Ex 1.1.18
	public static int mystery(int a, int b)
	{
		if (b == 0) return 0;
		if (b % 2 == 0) return mystery(a+a, b/2);
		return mystery(a+a, b/2) + a;
	}

	
	public static double lnFactorial(int N) {
		if ( N == 1 ) return 1;
		double sum = N * lnFactorial(N - 1);
		
		return  Math.log(sum);
	}
	
	// Ex 1.1.22
	public static int binarySearch(int []a, int key,int li,int hi, int count) {
		StdOut.println("High : " + hi + " ,Low : " + li + ",Depth : " + count);
		if( li > hi ) return -1;
		int mid = li + ( hi - li ) / 2;
		if( a[mid] == key ) return mid;
		else if (a[mid] > key) return binarySearch(a, key, li , mid - 1,++count);
		else return binarySearch(a, key, mid + 1, hi,++count);	
	}
	
	// Ex 1.1.6
	public static void nonRecursiveFibonachi() {
		int f = 0;
		int g = 1;
		for (int i = 0; i <= 15; i++)
		{
			StdOut.println(f);
			f = f + g;
			g = f - g;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ex 1.1.7.a
		double t = 9.0;
		while (Math.abs(t - 9.0/t) > .001)
		t = (9.0/t + t) / 2.0;
		StdOut.printf("%.5f\n", t);
		
		// Ex 1.1.7.c
		int sum = 0;
		for (int i = 1; i < 1000; i *= 2)
		for (int j = 0; j < 14; j++)
		sum++;
		StdOut.println(sum);
		
		// Ex 1.1.8
		System.out.println((char)('z' - 'A'));
		System.out.println('b');
		System.out.println('b' + 4);
		
		// Ex 1.1.9
		String s = "";
		int a = 8;
		while( a >= 1 ) {
			s = a % 2 + s;
			a = a / 2;
		}
		
		StdOut.println(s);
	
		// Ex 1.1.12
		int[] a1 = new int[10];
		for (int i = 0; i < 10; i++)
		a1[i] = 9 - i;
		for (int i = 0; i < 10; i++)
		a1[i] = a1[a1[i]];
		for (int i = 0; i < 10; i++)
		System.out.println(a1[i]);
		
		// Client Code of histogram function
		int[] a2 = {0,0,0,1,2,3,4,4,1,2};
		int M = a2.length;
		int[] b= histogram(a2, M);
		int sum1 =0 ;
		for(int i=0; i< b.length; i++ ) {
			sum1 += b[i];
			StdOut.println(b[i]);
		}
		
		// Client Code of BinarySearch function
		int[] a3 = { 1,  3, 4, 5, 6, 7, 98989 };
		int key = 98989;
		
		StdOut.println(binarySearch(a3, key, 0, 6,0));
		
		
	}
}
