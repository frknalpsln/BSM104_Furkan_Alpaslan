package week9;

import java.util.Stack;

public class validParanthesis {

	public boolean validParanthesis(String str) {
		
		Stack<Character> s = new Stack<Character>();
		
		for(char x:str.toCharArray()) {
			if(x == '{' || x=='[' || x== '(') {
				s.push(x);
			}
			else if(s.isEmpty() && (x == ']' && s.peek() == '[' || x== '}' && s.peek() == '{' || x=='(' && s.peek() == '(')) {
			s.pop();
		}
			else {
		return false;
		}
			
			
	}
	return s.isEmpty();
	}
}