
public class infixExpressionS1S3Q9P162 {
	public static String infixCreator(String s) {
		myStack<String> stack1 = new myStack<String>();
		myStack<String> stack2 = new myStack<String>();
		
		for(int i = 0; i < s.length(); i++ ){
			if( s.charAt(i) == ')' ) {
				
				// Getting top two item of stack1
				String first_value = stack1.pop();
				String second_value = stack1.pop();
				
				// Getting top operator in stack2
				String operator = stack2.pop();
				
				stack1.push( "( " + second_value + " " + operator + " " + first_value + " )" );
				
			} else if(s.charAt(i) != ' '){
				
				if( Character.isDigit(s.charAt(i)) ) {
					stack1.push( String.valueOf(s.charAt(i)) );
				} else {
					stack2.push( String.valueOf(s.charAt(i)) );
				}
			}
		}
		
		return stack1.pop();
	}
	
	public static void main(String[] args) {
		String s;
		while ( ( s = StdIn.readLine() ) != null ) {
			StdOut.println("Infixed Expression: " + infixCreator(s));
			
		}
	}
}
