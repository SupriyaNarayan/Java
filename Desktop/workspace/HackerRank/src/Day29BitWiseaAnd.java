import java.util.Scanner;


public class Day29BitWiseaAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int result=findBitwiseMax(n,k);
            System.out.println(result);
        }

	}

	private static int findBitwiseMax(int n, int k) {
		int[] arr=new int[n];
		int max;
		int resultAND;
		for(int i=0;i<n;i++)
		{
			arr[i]=i+1;
		}
		max=arr[0]&arr[1];
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				resultAND=(int)(arr[i]&arr[j]);
				if(resultAND>max && resultAND<k)
				{
					max=resultAND;
				}
			}
		}
		return max;
		
	}

}
