package main;

import java.util.Stack;

public class Brace {
	
	public static void main(String[] args) {
		String[] results;
		String[] values = new String[5];
		
		results = new String[values.length];
		results[0] = "asdsad";
		System.out.println(results[0]);
	}
	
	 static String[] braces(String[] values) {
	        String[] results = new String[values.length];
	        String s = "";
	        for(int i=0;i<values.length;i++)
	        {
	            s = values[i];
	            if((s.length()&1)==1)
	                results[i]="NO";
	            else{
	                char[] bracers = s.toCharArray();
	                Stack<Character> stack = new Stack<>();
	                for(char brace : bracers)
	                {
	                    switch(brace)
	                    {
	                        case '{' : stack.push('}'); break;
	                        case '(' : stack.push(')'); break;
	                        case '[' : stack.push(']'); break;
	                        default :
	                        if(stack.empty() || brace != stack.peek())
	                            results[i]="NO";
	                        stack.pop();    
	                    }

	                }
	                if(stack.isEmpty())
	                    results[i]="YES";
	            }    
	        }

	        return results;

	    }

}
