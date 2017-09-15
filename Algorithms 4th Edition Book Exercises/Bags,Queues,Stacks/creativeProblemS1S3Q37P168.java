
public class creativeProblemS1S3Q37P168 {
	
	static void Josephus(int n,int m) {
		int count = 0;
		
		// Josephus Problem
		Deque<Integer> queue = new Deque();
		
		// Adding population to our queue
		for(int i = 0;i < n; i++) { queue.insert_at_start(i); }
		
		while( queue.size() >= 1 ) {
			
			if( ++count == m ) { 
				StdOut.println(queue.remove_from_end());
				count = 0;
			} else {
				queue.insert_at_start( queue.remove_from_end() );
			}
		}
	}
		
	public static void main(String[] args) {
		Josephus(7,2);
	}
}
