public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "-123";
		int number = 123;
		toConvertToInt(str);
		toConvertToString(number);

	}

	private static void toConvertToString(int number) {
		// TODO Auto-generated method stub
		int temp = 0;
		int num=number;
		StringBuilder sb = new StringBuilder();
		while(num>0){
		temp = num % 10;
		sb.insert(0, temp);
		num = num/10;
		}
		System.out.println(sb.toString());
		
		
		
		
	}

	private static void toConvertToInt(String str) {
		// TODO Auto-generated method stub
		int count=0;
		int return_num =0;
		for(int i =str.length()-1 ; i>=0;i--){
			if(i==0 && str.charAt(i) == '-'){
				return_num = -1 * return_num;
			}
			else{
			int temp1 = str.charAt(i) - 48;
			temp1 = (int) (temp1* Math.pow(10, count));
			count++;
			return_num = return_num + temp1;
			}
		}
		System.out.println(return_num);
		
	}

}
