import java.util.Stack;

public class Parentheses {
	public static boolean checkParentheses(String s) {
		myStack<Character> stack = new myStack<Character>();
		char temp;
		boolean next = true;

		// Splitting string and pushing Character by Character into the stack
		for(int i = 0; i < s.length() && next; i++) {
				if( s.charAt(i) == ')' ) {
					next = false;
					while(!stack.isEmpty()) {
						temp = stack.pop();
						if( temp == '(' ) { next = true; break; }
						else if ( temp == '{' || temp == '[' ) { return false; }
					}
				} else if( s.charAt(i) == ']' ) {
					next = false;
					while(!stack.isEmpty()) {
						temp = stack.pop();
						if( temp == '[' ) { next = true; break; }
						else if ( temp == '{' || temp == '(' ) { return false; }
					}
				} else if( s.charAt(i) == '}' ) {
					next = false;
					while(!stack.isEmpty()) {
						temp = stack.pop();
						if( temp  == '{' ) { next = true; break; }
						else if ( temp == '(' || temp == '[' ) { return false; }
					}
				} else { stack.push(s.charAt(i)); }
		}
		
		if ( next && stack.isEmpty() ) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		String s;
		while( ( s = StdIn.readLine() ) != null ) {
			StdOut.println("This text " + ( checkParentheses(s) ? "is" : "isn't" ) + " Balanced!" );	
		}
	}
}
