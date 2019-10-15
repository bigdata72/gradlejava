package hackerrank.queueandstack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

	public static final char [][] TOKENS = {{'{', '}'}, {'[', ']'}, {'(',')'}};

	public static boolean isBalanced(String exp) {
		Stack<Character> stack = new Stack<>();
		for(char c: exp.toCharArray()){
			if(isOpenTerm(c)){
				stack.push(c);
			}else{
				if(stack.empty() || !matches(stack.pop(), c)){
					return false;
				}
			}
		}
		return stack.isEmpty();
	}


	public static boolean isOpenTerm(char openTerm){
		for(char[] array : TOKENS){
			if(array[0] == openTerm) {
				return true;
			}
		}
		return false;
	}

	public static boolean matches(char openTerm, char closeTerm){
		for(char[] array : TOKENS){
			if(array[0] == openTerm) {
				return array[1] == closeTerm;
			}
		}
		return false;
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a String expression for balanced parenthesis check");
		String input = scanner.next();
		char[] charInput = input.toCharArray();
		System.out.println("the input is:");
		System.out.println(input.toCharArray());
		System.out.println("the given input is "+(isBalanced(input)?"balanced": "not balanced"));
	}
}
