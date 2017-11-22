package test;

import java.util.Stack;

public class BinarySearchTree {
	
	public static void main(String args[])
	{
		/*char mot[];
		char mot2[]="test";
		char message="";*/
		
		String expression="qem+te";
		
		//String token[]=expression.split("\\-|\\*|\\+|\\%");
		
		//System.out.println(token);
		
		char[] tokens = expression.toCharArray();
		 
		// Stack<Integer> values = new Stack<Integer>();
		Stack<String> values = new Stack<String>();
		Stack<Character> ops = new Stack<Character>();
		
		  for (int i = 0; i < tokens.length;)
	        {
			  
			  if ((tokens[i] >= 'a' && tokens[i] <= 'z') ||(tokens[i] >= 'A' && tokens[i] <= 'Z'))
	            {
	                StringBuffer sbuf = new StringBuffer();
	                // There may be more than one digits in number
	                while ((i < tokens.length) && ((tokens[i] >= 'a' && tokens[i] <= 'z') ||(tokens[i] >= 'A' && tokens[i] <= 'Z')))
	                    sbuf.append(tokens[i++]);
	                values.push(sbuf.toString());
	               
	              
	            }
			   else if (tokens[i] == '+' || tokens[i] == '-' ||tokens[i] == '*' || tokens[i] == '/')
	            {
	                // While top of 'ops' has same or greater precedence to current
	                // token, which is an operator. Apply operator on top of 'ops'
	                // to top two elements in values stack
				   while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
		                  values.push(applyOp(ops.pop(), values.pop(), values.pop()));
		 
		                // Push current token to 'ops'.
		                ops.push(tokens[i++]);
	            }
				  
	        }
		
		
	}
	public static boolean hasPrecedence(char op1, char op2)
    {
        
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }
	  public static String applyOp(char op, String b, String a)
	    {
	       /* switch (op)
	        {
	        case '+':
	            return a + b;
	        case '-':
	            return a - b;
	        case '*':
	            return a * b;
	        case '/':
	            if (b == 0)
	                throw new
	                UnsupportedOperationException("Cannot divide by zero");
	            return a / b;
	        }*/
	        return "";
	    }

}
