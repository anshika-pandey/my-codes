import java.util.*;
class GFG { 
	static boolean isSubsetSum(int set[], 
							int n, int sum) 
	{ 
		if (sum == 0) 
			return true; 
		if (n == 0 && sum != 0) 
			return false; 

		if (set[n-1] > sum) 
			return isSubsetSum(set, n-1, sum); 

		return isSubsetSum(set, n-1, sum) || 
			isSubsetSum(set, n-1, sum-set[n-1]); 
	} 

	public static void main (String args[]) 
	{ 
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt(); 
		int sum = scan.nextInt(); 
		int []arr=new int [n];
		for (int i=0;i<n ;i++ ) {
			arr[i]=scan.nextInt();
		}
		if (isSubsetSum(arr, n, sum) == true){ 
			System.out.println(0);
		}
	} 
}
