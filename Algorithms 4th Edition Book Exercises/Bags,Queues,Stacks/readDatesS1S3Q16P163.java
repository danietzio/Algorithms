
public class readDatesS1S3Q16P163 {
	
	public static Date[] readDates(String stream) {
		In in;
		if(stream != null) { in = new In(stream); }
		else { in = new In(); }
		
		// ResizingArrayQueue had defined in ResizingArrayQueueS1S3Q13P163.java file
		ResizingArrayQueue<Date> queue = new ResizingArrayQueue();
		
		// Reading from input stream until EOF reached
		while(!in.isEmpty()){  queue.enqueue(new Date( in.readString() )); }
		
		// Get size of the queue
		int size = queue.size();
		Date[] arr = new Date[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = queue.dequeue();
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date[] dates = readDates(null);
		
		for(int i = 0; i < dates.length; i++) {
			StdOut.println("Date " + i + " : " + dates[i].toString());
		}
		
	}

}
