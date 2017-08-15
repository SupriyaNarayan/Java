import java.util.Stack;

public class stack_for_paran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "()())";
		
		System.out.println(toCheckparan(str));
		System.out.println(toCheckparan("(()))()"));
		System.out.println(toCheckparan("())"));
		System.out.println(toCheckparan("(()"));
		System.out.println(toCheckparan("(()))((())"));
		System.out.println(toCheckparan(str));
		

	}

	private static String toCheckparan(String str) {
		// TODO Auto-generated method stub

		Stack<Character> myStack = new Stack<>(); 
		Stack<Character> myStackrev = new Stack<>(); 
		StringBuilder sb = new StringBuilder();
		StringBuilder revsb =  new StringBuilder();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='('){
				myStack.push('(');
				sb.append('(');
			}
			else if(str.charAt(i)==')'){
				if(!myStack.isEmpty()){
					myStack.pop();
					sb.append(')');
				}
			}
		}
		if(!myStack.isEmpty()){
			String str1 = sb.toString();
			for(int i=str1.length()-1;i>=0;i--){
				if(str1.charAt(i)==')'){
					myStackrev.push(')');
					revsb.insert(0, ')');
				}
				else if(str.charAt(i)=='('){
					if(!myStackrev.isEmpty()){
						myStackrev.pop();
						revsb.insert(0, '(');
					}
				}
			}
		}
		else{
			return sb.toString();
		}

		return revsb.toString();


	}

}
