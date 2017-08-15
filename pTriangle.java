public class pTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		
		int[] array_previous;
		int[] array_curr = {1};
		System.out.println(array_curr[0]);
		for(int i=2;i<=n;i++){
			array_previous = array_curr;
			array_curr = new int[i];
			array_curr[0] = 1;
			array_curr[i-1]= 1;
			for(int j=0;j<=i-3;j++){
				array_curr[j+1] = array_previous[j] + array_previous[j+1];
			}
			for(int k=0;k<array_curr.length;k++){
				System.out.print(array_curr[k] + " ");
			}
			System.out.println(" ");
			
		}

	}

}
