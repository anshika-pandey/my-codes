import java.util.*;
public class steve {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		sieveoferete(n);
	}

	public static void sieveoferete(int n){
		boolean[] prime=new boolean[n+1];
		for (int i=0;i<n ;i++ ) {
			prime[i]=true;
		}
			for (int j=2; j*j<n; j++ ) {
				if (prime[j]==true) {
					for (int i=j*j;i<n ;i=i+j ) {
						prime[i]=false;
					}
				}
			}
			for (int i=2;i<=n ;i++ ) {
				if (prime[i]==true) {
					System.out.println(i+" ");
				}
			}
	}
}
