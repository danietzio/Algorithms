class steque<Item> extends linkListS1S3Q31<Item> {
	// Steque is a data type that support push, pop, enqueue operations.
	// We develop this data type with linked list
	// We can use linked list that we developed in Q1.3.31 ( DoubleNode )
	// We suppose end of the list is the top of the steque
	
	// Push operation add item to the top of the steque
	void push(Item item) {
		this.insert_at_end(item);
	}
	
	// Enqueue operation add item to the beginning of the steque
	void enqueue(Item item) {
		this.insert_at_start(item);
	}

	// Pop operation remove last item from the top of the steque
	Item pop() {
		return this.remove_from_end();
	}
}

public class creativeProblemS1S3Q32P167 {
	public static void main(String []args) {
		
		// Client code of the steque
		// Instantiate steque
		steque<String> stq = new steque();
		
		// steque push operation usage example
		stq.push("First");
		stq.push("Second");
		stq.push("Third");
		stq.push("Forth");
		stq.push("Fifth");
		
		StdOut.println(stq.toString());
		
		// steque enqueue operation usage example
		stq.enqueue("Sixth");
		stq.enqueue("Seventh");
		stq.enqueue("Eighth");
		
		StdOut.println(stq.toString());
		
		// steque pop operation usage example
		StdOut.println("Popped Item: " + stq.pop());
		StdOut.println("Popped Item: " + stq.pop());
		StdOut.println("Popped Item: " + stq.pop());
		
		StdOut.println(stq.toString());	
	}
}