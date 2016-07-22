import java.util.Stack;

//Evaluation of Postfix expression
public class Solution2 {

	public static int solution(String S) {
		// write your code in Java SE 8
		if (S == null)
			return -1;
		
		Stack<Integer> myStack=new Stack<Integer>();
		for(int i=0;i<S.length();i++)
		{
			if(Character.isDigit(S.charAt(i)))
			{
				myStack.push(Character.getNumericValue(S.charAt(i)));
			}
			else if(S.charAt(i)=='*')
			{
				if(myStack.size()<2)
					return -1;
				else
				{
					int a=myStack.pop();
					int b=myStack.pop();
					int res=a*b;
					if(res>4095)
						return -1;
					else
						myStack.push(res);
				}
			}
			else if(S.charAt(i)=='+')
			{
				if(myStack.size()<2)
					return -1;
				else
				{
					int a=myStack.pop();
					int b=myStack.pop();
					int res=a+b;
					if(res>4095)
						return -1;
					else
						myStack.push(res);
				}
			}
		}
		if(myStack.isEmpty())
			return -1;

		return myStack.pop();

	}

	public static void main(String[] args) {
		// String s=new String("13+62*7+*");
		String s=new String("*7*8*");
		int ans= solution(s);
		System.out.println(ans);

	}

}
