package Leetcode;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		boolean result=false;
		if(s==null){
			return true;
		}
		if(s.isEmpty()){
			return true;
		}
		Stack<Character> stack=new Stack<Character>();
		char charA[]=s.toCharArray();
		for(char c : charA){
			if(c =='{' || c =='(' || c =='['){
				stack.push(c);
			}else{
				char charP=' ';
				if(!stack.isEmpty())
				 charP = stack.pop();
				if(c == '}' && charP== '{'){
					result=true;
				}
				else if(c == ')' && charP== '('){
					result=true;
				}
				else if(c == ']' && charP== '['){
					result=true;
				}
				else{
					result=false;
					break;
				}
			}
			if(!stack.isEmpty()){
				result=false;
			}
		}

		return result;

	}


	public static void main(String[] args) {
		ValidParentheses valid=new ValidParentheses();
		boolean test=valid.isValid("{)[]");
		System.out.println(test);
	}
}
