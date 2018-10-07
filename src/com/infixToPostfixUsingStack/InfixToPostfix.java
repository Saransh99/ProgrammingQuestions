package com.infixToPostfixUsingStack;
import java.util.Stack;

public class InfixToPostfix {

	// this is the precenedence switch for the operators
	static int precendence(char ch) {
		
		switch(ch) {
		
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		
		return -1;
	}
	
	public static String infixToPostfix(String expression) {
		
		String result = new String("");
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<expression.length(); i++) {
			char c = expression.charAt(i);  // c will read the character from the expression 
			
			if(Character.isLetterOrDigit(c)) { // if the scanned char is a operand then add it to the output 
				result += c;
				
				// if the char is a opening char then push it to the stack
			}else if(c=='(') {
				stack.push(c);
				// if the scanned char is the closing bracket then pop the output until the opening bracket is encountred
			}else if(c==')') {
				while(!stack.isEmpty() && stack.peek() != '(') 
					result += stack.pop();
				
				if(!stack.isEmpty() && stack.peek() != '(')
					return "invalid expression";
				else
					stack.pop();
			}else {
				// an operator is encountered 
				while(!stack.isEmpty() && precendence(c)<=precendence(stack.peek()))
					result += stack.pop();
				stack.push(c);
			}
		}
		
		// pop all the operators from the stack
		while (!stack.isEmpty())
			result += stack.pop();
		
		return result;
	}
	
	public static void main(String[] args) {
		String expression = "a+b(c^d-e)^(f+g*h)-i";
		System.out.println(infixToPostfix(expression));
	}
}
