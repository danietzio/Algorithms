import java.util.Stack;

//this code assumes that the expression
//is fully parenthesized, with numbers and characters
//separated by whitespace.

public class evaluateExpressionPage129 {
	public static boolean checkInt(String s) {
		try {
			double a = Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			// TODO: handle exception
			return false;
		}
	}
	public static void main(String []args) {
		Stack<String> stack = new Stack<String>();
		
		while( !StdIn.isEmpty() ) {
			String value = " ";
			
			if( ( value = StdIn.readString() ).equals(")")) {
				double firstValue = 0, computed = 0;
				String popValue = " ";
				
				while( !( popValue = stack.pop() ).equals("(")) {
					
					if ( !checkInt( popValue )) {
						if( popValue.equals("*") ) {
							computed = firstValue * Double.parseDouble(stack.pop());
						} else if( popValue.equals("-")) {
							computed = firstValue - Double.parseDouble(stack.pop());
						} else if ( popValue.equals("/") ) {
							computed = firstValue / Double.parseDouble(stack.pop());
						} else if ( popValue.equals("+") ) {
							computed = firstValue + Double.parseDouble(stack.pop()); 
						}
						stack.push(String.valueOf(computed));
					} else {
						firstValue = Double.parseDouble(popValue);
					}
				}
				
				stack.push(String.valueOf(firstValue));
			} else {
				stack.push(value);
			}
		}
		
		for(String s : stack) {
			StdOut.println(s);
		}
	}
}
